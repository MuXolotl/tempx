package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: lؚٗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16969l {
    public static final char[] yandex;

    static {
        char[] cArr = new char[80];
        yandex = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void crashlytics(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(yandex, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fc  */
    public static void loadAd(AbstractC17187l abstractC17187l, StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC17187l.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                yandex(sb, i, strSubstring.substring(0, strSubstring.length() - 4), AbstractC17187l.admob(method2, abstractC17187l, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                yandex(sb, i, strSubstring.substring(0, strSubstring.length() - 3), AbstractC17187l.admob(method, abstractC17187l, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objAdmob = AbstractC17187l.admob(method4, abstractC17187l, new Object[0]);
                    if (method5 == null) {
                        if (objAdmob instanceof Boolean) {
                            if (((Boolean) objAdmob).booleanValue()) {
                                yandex(sb, i, strSubstring, objAdmob);
                            }
                        } else if (objAdmob instanceof Integer) {
                            if (((Integer) objAdmob).intValue() != 0) {
                                yandex(sb, i, strSubstring, objAdmob);
                            }
                        } else if (objAdmob instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objAdmob).floatValue()) != 0) {
                                yandex(sb, i, strSubstring, objAdmob);
                            }
                        } else if (!(objAdmob instanceof Double)) {
                            if (objAdmob instanceof String) {
                                zEquals = objAdmob.equals("");
                            } else if (objAdmob instanceof C1998l) {
                                zEquals = objAdmob.equals(C1998l.f4517l);
                            } else if (objAdmob instanceof AbstractC6909l) {
                                if (objAdmob != ((AbstractC17187l) ((AbstractC17187l) ((AbstractC6909l) objAdmob)).subs(6, null))) {
                                    yandex(sb, i, strSubstring, objAdmob);
                                }
                            } else if (!(objAdmob instanceof Enum) || ((Enum) objAdmob).ordinal() != 0) {
                                yandex(sb, i, strSubstring, objAdmob);
                            }
                            if (!zEquals) {
                                yandex(sb, i, strSubstring, objAdmob);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objAdmob).doubleValue()) != 0) {
                            yandex(sb, i, strSubstring, objAdmob);
                        }
                    } else if (((Boolean) AbstractC17187l.admob(method5, abstractC17187l, new Object[0])).booleanValue()) {
                        yandex(sb, i, strSubstring, objAdmob);
                    }
                }
            }
            i2 = 3;
        }
    }

    public static void yandex(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                yandex(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                yandex(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        crashlytics(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C1998l c1998l = C1998l.f4517l;
            sb.append(AbstractC2219l.subs(new C1998l(((String) obj).getBytes(AbstractC11966l.yandex))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C1998l) {
            sb.append(": \"");
            sb.append(AbstractC2219l.subs((C1998l) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC17187l) {
            sb.append(" {");
            loadAd((AbstractC17187l) obj, sb, i + 2);
            sb.append("\n");
            crashlytics(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        yandex(sb, i3, "key", entry.getKey());
        yandex(sb, i3, "value", entry.getValue());
        sb.append("\n");
        crashlytics(i, sb);
        sb.append("}");
    }
}
