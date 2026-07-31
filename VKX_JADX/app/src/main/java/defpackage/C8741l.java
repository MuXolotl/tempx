package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lٌّٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8741l {
    public static final C8741l yandex = new C8741l();
    public static final C8123l loadAd = C8123l.f16928l;
    public static final C8319l crashlytics = new C8319l(C3498l.mopub(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
    public static final C14487l amazon = loadAd(EnumC5123l.f11129l, new String[0]);
    public static final C14487l purchase = loadAd(EnumC5123l.f11127l, new String[0]);
    public static final Set billing = Collections.singleton(new C18115l());

    public static C14487l amazon(EnumC5123l enumC5123l, List list, InterfaceC1925l interfaceC1925l, String... strArr) {
        return new C14487l(interfaceC1925l, yandex(7, false, (String[]) Arrays.copyOf(new String[]{interfaceC1925l.toString()}, 1)), enumC5123l, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static C5260l crashlytics(EnumC5123l enumC5123l, String... strArr) {
        return new C5260l(enumC5123l, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final C14487l loadAd(EnumC5123l enumC5123l, String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return amazon(enumC5123l, C2580l.f5619l, crashlytics(enumC5123l, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static final boolean purchase(InterfaceC8371l interfaceC8371l) {
        if (interfaceC8371l != null) {
            return (interfaceC8371l instanceof C8319l) || (interfaceC8371l.Signature() instanceof C8319l) || interfaceC8371l == loadAd;
        }
        return false;
    }

    public static final C7662l yandex(int i, boolean z, String... strArr) {
        if (!z) {
            return new C7662l(i, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new C0781l(i, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }
}
