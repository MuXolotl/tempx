package defpackage;

import android.os.Build;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: lًۦٌ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8409l {
    public final C7094l loadAd;
    public final InterfaceC18322l yandex;
    public static final Map crashlytics = Collections.singletonMap("Google", AbstractC8669l.m2407import(new String[]{"oriole", "raven", "bluejay", "panther", "cheetah", "lynx"}));
    public static final Map amazon = AbstractC8676l.remoteconfig(new C8195l("google", AbstractC8669l.m2407import(new String[]{"pixel 4", "pixel 4 xl"})), new C8195l("samsung", Collections.singleton("sm-g770f")));

    public C8409l(InterfaceC18322l interfaceC18322l, C7094l c7094l) {
        this.yandex = interfaceC18322l;
        this.loadAd = c7094l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public final boolean yandex(String str) {
        boolean z;
        this.loadAd.getClass();
        if (Build.VERSION.SDK_INT <= 32) {
            C11905l c11905l = InterfaceC5389l.admob;
            InterfaceC5389l interfaceC5389lPurchase = ((C10596l) this.yandex).purchase(str);
            c11905l.getClass();
            if (C11905l.loadAd(interfaceC5389lPurchase)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z || ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && str.equals("1"));
    }
}
