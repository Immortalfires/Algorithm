import java.util.Scanner;

/**
 * @author:Aurevoir
 * @date: 2019/12/4  21:47
 */
public class N165第2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(compareVersion(str1,str2));
    }

    private static int compareVersion(String version1, String version2) {

        int[] vs1 = canonicalVersions(version1);
        int[] vs2 = canonicalVersions(version2);
        int len = Math.min(vs1.length, vs2.length);
        for (int i = 0; i < len; i++) {
            if (vs1[i] > vs2[i]) {
                return 1;
            } else if (vs1[i] < vs2[i]) {
                return -1;
            }
        }

        if (vs1.length > vs2.length) {
            for (int i = len; i < vs1.length; i++) {
                if (vs1[i] > 0) {
                    return 1;
                }
            }
        } else {
            for (int i = len; i < vs2.length; i++) {
                if (vs2[i] > 0) {
                    return -1;
                }
            }
        }
        return 0;
    }
    private static int[] canonicalVersions(String versionStr) {

        int[] versions = new int[versionStr.length() / 2 + 1];
        int versionCount = 0;
        int version = 0;

        for (int i = 0; i < versionStr.length(); i++) {
            char c = versionStr.charAt(i);
            if (c == '.') {
                versions[versionCount++] = version;
                version = 0;
            } else if (c != '0' || version > 0) {
                version = version * 10 + c - '0';
            }
        }
        versions[versionCount] = version;
        return versions;
    }
}
