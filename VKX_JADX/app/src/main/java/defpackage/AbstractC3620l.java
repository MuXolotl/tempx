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

/* JADX INFO: renamed from: lؕۚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3620l {
    public static final char[] yandex;

    static {
        char[] cArr = new char[80];
        yandex = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0201  */
    public static void crashlytics(AbstractC15603l abstractC15603l, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC15603l.getClass().getDeclaredMethods();
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
                    yandex(sb, i, strSubstring.substring(0, strSubstring.length() - 4), AbstractC15603l.billing(method2, abstractC15603l, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                yandex(sb, i, strSubstring.substring(0, strSubstring.length() - 3), AbstractC15603l.billing(method, abstractC15603l, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objBilling = AbstractC15603l.billing(method4, abstractC15603l, new Object[0]);
                    if (method5 == null) {
                        if (objBilling instanceof Boolean) {
                            if (((Boolean) objBilling).booleanValue()) {
                                yandex(sb, i, strSubstring, objBilling);
                            }
                        } else if (objBilling instanceof Integer) {
                            if (((Integer) objBilling).intValue() != 0) {
                                yandex(sb, i, strSubstring, objBilling);
                            }
                        } else if (objBilling instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objBilling).floatValue()) != 0) {
                                yandex(sb, i, strSubstring, objBilling);
                            }
                        } else if (!(objBilling instanceof Double)) {
                            if (objBilling instanceof String) {
                                zEquals = objBilling.equals("");
                            } else if (objBilling instanceof AbstractC1096l) {
                                zEquals = objBilling.equals(AbstractC1096l.f3033l);
                            } else if (objBilling instanceof AbstractC1251l) {
                                if (objBilling != ((AbstractC15603l) ((AbstractC15603l) ((AbstractC1251l) objBilling)).remoteconfig(6, null))) {
                                    yandex(sb, i, strSubstring, objBilling);
                                }
                            } else if (!(objBilling instanceof Enum) || ((Enum) objBilling).ordinal() != 0) {
                                yandex(sb, i, strSubstring, objBilling);
                            }
                            if (!zEquals) {
                                yandex(sb, i, strSubstring, objBilling);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objBilling).doubleValue()) != 0) {
                            yandex(sb, i, strSubstring, objBilling);
                        }
                    } else if (((Boolean) AbstractC15603l.billing(method5, abstractC15603l, new Object[0])).booleanValue()) {
                        yandex(sb, i, strSubstring, objBilling);
                    }
                }
            }
            i2 = i3;
        }
        if (abstractC15603l instanceof AbstractC13398l) {
            Iterator itCrashlytics = ((AbstractC13398l) abstractC15603l).zzb.crashlytics();
            while (itCrashlytics.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itCrashlytics.next();
                ((AbstractC1552l) entry2.getKey()).getClass();
                yandex(sb, i, AbstractC15560l.tapsense("[", 0, "]"), entry2.getValue());
            }
        }
        C2886l c2886l = abstractC15603l.zzc;
        if (c2886l != null) {
            for (int i5 = 0; i5 < c2886l.yandex; i5++) {
                yandex(sb, i, String.valueOf(c2886l.loadAd[i5] >>> 3), c2886l.crashlytics[i5]);
            }
        }
    }

    public static void loadAd(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(yandex, 0, i2);
            i -= i2;
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
        loadAd(i, sb);
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
            sb.append(AbstractC11790l.admob(new C1700l(((String) obj).getBytes(AbstractC11565l.yandex))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1096l) {
            sb.append(": \"");
            sb.append(AbstractC11790l.admob((AbstractC1096l) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC15603l) {
            sb.append(" {");
            crashlytics((AbstractC15603l) obj, sb, i + 2);
            sb.append("\n");
            loadAd(i, sb);
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
        loadAd(i, sb);
        sb.append("}");
    }
}
