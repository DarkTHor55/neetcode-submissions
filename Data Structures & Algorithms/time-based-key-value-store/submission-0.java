 class TimeMap {
        class Pair {
            String value;
            int timestamp;

            Pair(String value, int timestamp) {
                this.value = value;
                this.timestamp = timestamp;
            }
        }

        Map<String, List<Pair>> map;

        public TimeMap() {
            map = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(new Pair(value, timestamp));
        }

        public String get(String key, int timestamp) {

            if (!map.containsKey(key)) {
                return "";
            }

            List<Pair> list = map.get(key);
            int st = 0;
            int ed = list.size() - 1;
            String res = "";
            while (st <= ed) {
                int mid = st + (ed - st) / 2;
                if (list.get(mid).timestamp <= timestamp) {
                    res = list.get(mid).value;
                    st = mid + 1;
                } else {
                    ed = mid - 1;
                }
            }

            return res;
        }
    }