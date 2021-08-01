# My_Refrigerator_Springboot
<p> 냉장고 관리 어플리케이션 백엔드 파일이다 </p>

## Controller 부분

```Java
    // GET 메소드
    // id pw가 넘어오면 id pw가 동일한지 확인 후 맞으면 true 아니면 false를 보내준다
    @GetMapping("/user")
    public Map<String, String> getUserProfile(@RequestParam(name="id") String id, @RequestParam(name="pw") String pw){
        System.out.println("받은 아이디 - " + id + " 비밀번호 - " + pw);
        HashMap<String, String> map = new HashMap<>();
        // Query로 들고가서 쿼리문
        map.put("result", "true");
        return map;
    }
    // POST 메소드
    // 회원가입을 위해 UserProfile을 요청, 정확히 넘어 왔으면 Ok를 넘겨줌
    @RequestMapping(method=RequestMethod.POST, value="/signup")
    public Map<String, String> postUserProfile(@RequestBody UserProfile userprofile){
            System.out.println("id " + userprofile.getId() + " password: " + userprofile.getPw());
            userMap.put(
                Integer.toString(count),
                new UserProfile(userprofile.getId(), userprofile.getPw(), userprofile.getName(), userprofile.getPhone(), userprofile.getDate())
            );
            count++;
            HashMap<String, String> map = new HashMap<>();
            map.put("result", "Ok");
            System.out.println(userMap.get("2") + "결과");
            return map;
    } 
```
