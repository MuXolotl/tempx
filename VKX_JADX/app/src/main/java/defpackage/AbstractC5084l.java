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

/* JADX INFO: renamed from: lؗۖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5084l {
    public static final char[] yandex;

    static {
        char[] cArr = new char[80];
        yandex = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0185  */
    /* JADX WARN: Code duplicated, block: B:75:0x0187  */
    public static void crashlytics(AbstractC8760l abstractC8760l, StringBuilder sb, int i) {
        int i2;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC8760l.getClass().getDeclaredMethods();
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
                loadAd(sb, i, AbstractC1757l.m1035native(4, 0, strSubstring), AbstractC8760l.amazon(method2, abstractC8760l, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                loadAd(sb, i, AbstractC1757l.m1035native(3, 0, strSubstring), AbstractC8760l.amazon(method, abstractC8760l, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objAmazon = AbstractC8760l.amazon(method4, abstractC8760l, new Object[0]);
                    if (method5 == null) {
                        zBooleanValue = true;
                        if (objAmazon instanceof Boolean) {
                            zEquals = !((Boolean) objAmazon).booleanValue();
                        } else if (objAmazon instanceof Integer) {
                            if (((Integer) objAmazon).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objAmazon instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objAmazon).floatValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objAmazon instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objAmazon).doubleValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objAmazon instanceof String) {
                            zEquals = objAmazon.equals("");
                        } else if (objAmazon instanceof C4966l) {
                            zEquals = objAmazon.equals(C4966l.f10110l);
                        } else if (!(objAmazon instanceof AbstractC1200l) ? !((objAmazon instanceof Enum) && ((Enum) objAmazon).ordinal() == 0) : objAmazon != ((AbstractC8760l) ((AbstractC8760l) ((AbstractC1200l) objAmazon)).loadAd(6))) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) AbstractC8760l.amazon(method5, abstractC8760l, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        loadAd(sb, i, strSubstring, objAmazon);
                    }
                }
            }
            i2 = 3;
        }
        C0774l c0774l = abstractC8760l.unknownFields;
        if (c0774l != null) {
            for (int i4 = 0; i4 < c0774l.yandex; i4++) {
                loadAd(sb, i, String.valueOf(c0774l.loadAd[i4] >>> 3), c0774l.crashlytics[i4]);
            }
        }
    }

    public static void loadAd(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                loadAd(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                loadAd(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        yandex(i, sb);
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
            C4966l c4966l = C4966l.f10110l;
            sb.append(AbstractC7000l.crashlytics(new C4966l(((String) obj).getBytes(AbstractC4579l.yandex))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C4966l) {
            sb.append(": \"");
            sb.append(AbstractC7000l.crashlytics((C4966l) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC8760l) {
            sb.append(" {");
            crashlytics((AbstractC8760l) obj, sb, i + 2);
            sb.append("\n");
            yandex(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        loadAd(sb, i3, "key", entry.getKey());
        loadAd(sb, i3, "value", entry.getValue());
        sb.append("\n");
        yandex(i, sb);
        sb.append("}");
    }

    public static void yandex(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(yandex, 0, i2);
            i -= i2;
        }
    }
}
