package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: lٗٔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17135l {
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

    /* JADX WARN: Code duplicated, block: B:101:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    public static void loadAd(AbstractC0288l abstractC0288l, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0288l.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
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
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    yandex(sb, i, strSubstring.substring(0, strSubstring.length() - 4), AbstractC0288l.startapp(method2, abstractC0288l, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                yandex(sb, i, strSubstring.substring(0, strSubstring.length() - 3), AbstractC0288l.startapp(method, abstractC0288l, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objStartapp = AbstractC0288l.startapp(method4, abstractC0288l, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) AbstractC0288l.startapp(method5, abstractC0288l, new Object[0])).booleanValue();
                    } else if (objStartapp instanceof Boolean) {
                        if (((Boolean) objStartapp).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objStartapp instanceof Integer) {
                        if (((Integer) objStartapp).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objStartapp instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objStartapp).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objStartapp instanceof Double)) {
                        if (objStartapp instanceof String) {
                            zEquals = objStartapp.equals("");
                        } else if (objStartapp instanceof AbstractC15619l) {
                            zEquals = objStartapp.equals(AbstractC15619l.f30516l);
                        } else if (!(objStartapp instanceof AbstractC12570l) ? !((objStartapp instanceof Enum) && ((Enum) objStartapp).ordinal() == 0) : objStartapp != ((AbstractC0288l) ((AbstractC0288l) ((AbstractC12570l) objStartapp)).subscription(6))) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objStartapp).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        yandex(sb, i, strSubstring, objStartapp);
                    }
                }
            }
            i2 = i3;
        }
        C10096l c10096l = abstractC0288l.zzc;
        if (c10096l != null) {
            for (int i5 = 0; i5 < c10096l.yandex; i5++) {
                yandex(sb, i, String.valueOf(c10096l.loadAd[i5] >>> 3), c10096l.crashlytics[i5]);
            }
        }
    }

    public static void yandex(StringBuilder sb, int i, String str, Object obj) {
        String strReplace;
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
        if (!(obj instanceof String)) {
            if (obj instanceof AbstractC15619l) {
                sb.append(": \"");
                sb.append(AbstractC13611l.mopub(((AbstractC15619l) obj).ads()));
                sb.append('\"');
                return;
            }
            if (obj instanceof AbstractC0288l) {
                sb.append(" {");
                loadAd((AbstractC0288l) obj, sb, i + 2);
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
            return;
        }
        sb.append(": \"");
        String strReplace2 = (String) obj;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < strReplace2.length(); i4++) {
            char cCharAt2 = strReplace2.charAt(i4);
            if (cCharAt2 < ' ' || cCharAt2 > '~') {
                strReplace = AbstractC13611l.mopub(strReplace2.getBytes(StandardCharsets.UTF_8));
                sb.append(strReplace);
                sb.append('\"');
            } else {
                if (cCharAt2 == '\"') {
                    z3 = true;
                } else if (cCharAt2 == '\'') {
                    z2 = true;
                } else if (cCharAt2 == '\\') {
                    z = true;
                }
            }
        }
        if (z) {
            strReplace2 = strReplace2.replace("\\", "\\\\");
        }
        strReplace = z2 ? strReplace2.replace("'", "\\'") : strReplace2;
        if (z3) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        sb.append(strReplace);
        sb.append('\"');
    }
}
