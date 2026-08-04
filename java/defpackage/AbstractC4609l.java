package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: lّؗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4609l {
    public static final AbstractC10601l yandex;

    static {
        AbstractC10601l abstractC10601l;
        try {
            abstractC10601l = AbstractC1344l.yandex;
        } catch (NoClassDefFoundError unused) {
            abstractC10601l = null;
        }
        if (abstractC10601l == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = AbstractC10601l.yandex[i];
                try {
                    abstractC10601l = (AbstractC10601l) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    sb.append('\n');
                    sb.append(str);
                    sb.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        yandex = abstractC10601l;
    }
}
