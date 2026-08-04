package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lۣ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18307l implements InterfaceC1110l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C13765l f35805l = new C13765l(1.0f);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C18662l f35806l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f35807l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C7504l f35808l;

    public C18307l(Context context) {
        this.f35807l = context;
    }

    @Override // defpackage.InterfaceC5763l
    public final InterfaceC15446l getKey() {
        return C15617l.f30492l;
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: import */
    public final InterfaceC12932l mo244import(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.mopub(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC1110l
    /* JADX INFO: renamed from: instanceof */
    public final float mo817instanceof() {
        InterfaceC14029l interfaceC14029l;
        InterfaceC2478l interfaceC2478l;
        if (this.f35808l == null) {
            Context context = this.f35807l;
            C13660l c13660l = AbstractC7980l.yandex;
            synchronized (c13660l) {
                try {
                    Object objMopub = c13660l.mopub(context);
                    interfaceC14029l = null;
                    if (objMopub == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        C7119l c7119lYandex = AbstractC12098l.yandex(-1, 0, null, 6);
                        int i = 1;
                        C14970l c14970l = new C14970l(8, new C13067l(contentResolver, uriFor, new C5848l(c7119lYandex, AbstractC15300l.billing(Looper.getMainLooper()), i), c7119lYandex, context, null));
                        C18662l c18662lLoadAd = AbstractC11990l.loadAd();
                        C12051l c12051l = new C12051l(Long.MAX_VALUE);
                        Float fValueOf = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                        C11522l c11522lAmazon = AbstractC16829l.amazon(c14970l);
                        C1008l c1008lYandex = AbstractC11190l.yandex(fValueOf);
                        InterfaceC12932l interfaceC12932l = (InterfaceC12932l) c11522lAmazon.purchase;
                        InterfaceC6942l interfaceC6942l = (InterfaceC6942l) c11522lAmazon.amazon;
                        if (!c12051l.equals(C16110l.yandex)) {
                            i = 4;
                        }
                        C7549l c7549l = new C7549l(c1008lYandex, AbstractC10999l.billing(i, interfaceC12932l, c18662lLoadAd, new C0384l(c12051l, interfaceC6942l, c1008lYandex, fValueOf, (InterfaceC14029l) null, 20)));
                        c13660l.vip(context, c7549l);
                        objMopub = c7549l;
                    }
                    interfaceC2478l = (InterfaceC2478l) objMopub;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f35805l.subs(((Number) interfaceC2478l.getValue()).floatValue());
            C18662l c18662l = this.f35806l;
            if (c18662l == null) {
                C8339l.smaato("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.f35808l = AbstractC10999l.mopub(c18662l, null, 0, new C5888l(interfaceC2478l, this, interfaceC14029l, 2), 3);
        }
        return this.f35805l.admob();
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final InterfaceC5763l mo245l(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.crashlytics(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final InterfaceC12932l mo246l(InterfaceC12932l interfaceC12932l) {
        return AbstractC10586l.billing(this, interfaceC12932l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚْٟ */
    public final Object mo247l(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
