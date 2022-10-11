package exam_map;

import java.util.*;

public class HashMapExample2 {
    public static void main(String[] args) {
        HashMap<String, Student> st = new HashMap<>();
        st.put("1", new Student(99030001, "홍길동"));
        st.put("2", new Student(99030002, "김도훈"));
        st.put("3", new Student(99030003, "윤도희"));

        System.out.println(st.toString());
        //{1=이름 : 홍길동 학번 : 99030001, 2=이름 : 김도훈 학번 : 99030002, 3=이름 : 윤도희 학번 : 99030003}

        Set<String> keySet = st.keySet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Student sst = st.get(key);
            System.out.println(key + " " + sst.toString());
        }
        //1 이름 : 홍길동 학번 : 99030001
        //2 이름 : 김도훈 학번 : 99030002
        //3 이름 : 윤도희 학번 : 99030003

        for (Map.Entry<String, Student> s : st.entrySet()) {
            String key = s.getKey();
            Student value = s.getValue();
            System.out.println("key=" + key + ", value=" + value);
        }
        //key=1, value=이름 : 홍길동 학번 : 99030001
        //key=2, value=이름 : 김도훈 학번 : 99030002
        //key=3, value=이름 : 윤도희 학번 : 99030003

        Map<Student, Integer> map = new HashMap<>();
        map.put(new Student(70010001,"이현주"),95);
        map.put(new Student(70010001,"이현주"),89);
        System.out.println("총 엔트리 수 : " + map.size());
        System.out.println(map.toString());
        //총 엔트리 수 : 1
        //{이름 : 이현주 학번 : 70010001=89}

        TreeMap<String, Student> tMap = new TreeMap<>();
        tMap.put("1", new Student(94010001, "hong"));
        tMap.put("4", new Student(95020001, "kim"));
        tMap.put("2", new Student(97010001, "yoon"));
        tMap.put("3", new Student(99030003, "kim"));
        System.out.println(tMap.toString());
        //{1=이름 : hong 학번 : 94010001, 2=이름 : yoon 학번 : 97010001, 3=이름 : kim 학번 : 99030003, 4=이름 : kim 학번 : 95020001}

        TreeMap<Student, Integer> sMap = new TreeMap<>();
        sMap.put(new Student(97010001,"yoon"),89);
        sMap.put(new Student(95020001,"kim"),90);
        sMap.put(new Student(94010001,"hong"),99);
        sMap.put(new Student(99030003,"kim"),79);

        for (Map.Entry<Student, Integer> sd : sMap.entrySet()) {
            Student key = sd.getKey();
            Integer value = sd.getValue();
            System.out.println("key=" + key + ", value=" + value);
        }
        //key=이름 : hong 학번 : 94010001, value=99
        //key=이름 : kimh 학번 : 95020001, value=90
        //key=이름 : yoon 학번 : 97010001, value=89
        //key=이름 : kinc 학번 : 99030003, value=79
    }
}
