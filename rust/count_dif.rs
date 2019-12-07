// Remark: using chars().count() is an O(n) operation so this slows
// the whole cumputing time down. Comparing bytes might work to, but only if
// ASCII is used

fn main() {
    fn mx_dif_lg(a1: Vec<&str>, a2: Vec<&str>) -> i32 {
        if a1.len() == 0 || a2.len() == 0 {
            return -1;
        }
        let mut max_dif: i32 = 0;
        for i in &a1 {
            for j in &a2 {
                let mut temp_dif: i32 = (i.chars().count() as i32 - j.chars().count() as i32);
                temp_dif = temp_dif.abs();
                if temp_dif > max_dif {
                    max_dif = temp_dif
                }
            }
        }
        return max_dif;
    }
}
