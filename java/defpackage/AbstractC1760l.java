package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lَؓٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1760l {
    public static WeakReference admob;
    public static final C15578l yandex = new C15578l(1744504977, false, new C10272l(12));
    public static final C15578l loadAd = new C15578l(-1633700879, false, new C10272l(13));
    public static final C15578l crashlytics = new C15578l(-1629908745, false, new C13881l(27));
    public static final C15578l amazon = new C15578l(1460936490, false, new C13881l(28));
    public static final C15578l purchase = new C15578l(2029096363, false, new C13881l(29));
    public static final C15578l billing = new C15578l(-2013949599, false, new C10272l(14));
    public static final C15578l mopub = new C15578l(2144990400, false, new C10272l(15));

    public static Executor crashlytics(Executor executor, AbstractC12138l abstractC12138l) {
        executor.getClass();
        return executor == EnumC1535l.f3808l ? executor : new ExecutorC13021l(executor, abstractC12138l, 0);
    }

    public static final C14724l loadAd(AbstractC1484l... abstractC1484lArr) {
        ArrayList arrayList = new ArrayList(abstractC1484lArr.length);
        if (abstractC1484lArr.length <= 0) {
            C8195l[] c8195lArr = (C8195l[]) arrayList.toArray(new C8195l[0]);
            return new C14724l(AbstractC8676l.vip((C8195l[]) Arrays.copyOf(c8195lArr, c8195lArr.length)));
        }
        AbstractC1484l abstractC1484l = abstractC1484lArr[0];
        throw null;
    }

    public static String yandex(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            C8339l.metrica("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
