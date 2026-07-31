package defpackage;

import android.os.Build;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lؑۨؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0732l implements InterfaceC0844l {
    public static final C11155l admob;
    public static final int mopub;
    public final C13335l amazon;
    public final C4910l billing = AbstractC8618l.yandex();
    public final C6579l crashlytics;
    public final InterfaceC6095l loadAd;
    public final C2072l purchase;
    public final C3982l yandex;

    static {
        C6760l c6760l = C9658l.f19699l;
        mopub = (int) C9658l.admob(AbstractC15918l.tapsense(24, EnumC16636l.HOURS), EnumC16636l.SECONDS);
        admob = new C11155l("/");
    }

    public C0732l(C3982l c3982l, InterfaceC6095l interfaceC6095l, C6579l c6579l, C13335l c13335l, C2072l c2072l) {
        this.yandex = c3982l;
        this.loadAd = interfaceC6095l;
        this.crashlytics = c6579l;
        this.amazon = c13335l;
        this.purchase = c2072l;
    }

    @Override // defpackage.InterfaceC0844l
    public final Double amazon() {
        return this.purchase.yandex().loadAd;
    }

    @Override // defpackage.InterfaceC0844l
    public final C9658l crashlytics() {
        Integer num = this.purchase.yandex().crashlytics;
        if (num == null) {
            return null;
        }
        C6760l c6760l = C9658l.f19699l;
        return new C9658l(AbstractC15918l.tapsense(num.intValue(), EnumC16636l.SECONDS));
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bd A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004d, B:46:0x00b3, B:48:0x00bd, B:51:0x00c8, B:54:0x0170), top: B:63:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8 A[Catch: all -> 0x0051, TRY_ENTER, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004d, B:46:0x00b3, B:48:0x00bd, B:51:0x00c8, B:54:0x0170), top: B:63:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:53:0x016f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0170 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004d, B:46:0x00b3, B:48:0x00bd, B:51:0x00c8, B:54:0x0170), top: B:63:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0175  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00c8, please report this as an issue */
    @Override // defpackage.InterfaceC0844l
    public final Object loadAd(InterfaceC14029l interfaceC14029l) throws Throwable {
        C9734l c9734l;
        InterfaceC1601l interfaceC1601l;
        InterfaceC1601l interfaceC1601l2;
        InterfaceC1601l interfaceC1601l3;
        String str;
        Object objFirebase;
        C0732l c0732l = this;
        if (interfaceC14029l instanceof C9734l) {
            c9734l = (C9734l) interfaceC14029l;
            int i = c9734l.f19860l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9734l.f19860l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9734l = new C9734l(c0732l, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c9734l = new C9734l(c0732l, (AbstractC0283l) interfaceC14029l);
        }
        Object obj = c9734l.f19863l;
        int i2 = c9734l.f19860l;
        int i3 = 2;
        InterfaceC14029l interfaceC14029l2 = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                C4910l c4910l = c0732l.billing;
                if (!c4910l.purchase() && !c0732l.purchase.loadAd()) {
                    return Unit.INSTANCE;
                }
                c9734l.f19862l = c0732l;
                c9734l.f19861l = c4910l;
                c9734l.f19860l = 1;
                Object objYandex = c4910l.yandex(c9734l);
                interfaceC1601l = c4910l;
                if (objYandex != enumC9342l) {
                }
                return enumC9342l;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interfaceC1601l2 = (InterfaceC1601l) c9734l.f19862l;
                    try {
                        AbstractC2829l.crashlytics(obj);
                        interfaceC1601l2 = interfaceC1601l2;
                        Unit unit = Unit.INSTANCE;
                        interfaceC1601l2.billing(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC1601l2.billing(null);
                        throw th;
                    }
                }
                InterfaceC1601l interfaceC1601l4 = c9734l.f19861l;
                c0732l = (C0732l) c9734l.f19862l;
                try {
                    AbstractC2829l.crashlytics(obj);
                    interfaceC1601l3 = interfaceC1601l4;
                    str = ((C0807l) obj).yandex;
                    if (str.equals("")) {
                        Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                        Unit unit2 = Unit.INSTANCE;
                        interfaceC1601l3.billing(null);
                        return unit2;
                    }
                    C8195l c8195l = new C8195l("X-Crashlytics-Installation-ID", str);
                    String str2 = Build.MANUFACTURER + Build.MODEL;
                    c0732l.getClass();
                    C11155l c11155l = admob;
                    C8195l c8195l2 = new C8195l("X-Crashlytics-Device-Model", c11155l.f22430l.matcher(str2).replaceAll(""));
                    C8195l c8195l3 = new C8195l("X-Crashlytics-OS-Build-Version", c11155l.f22430l.matcher(Build.VERSION.INCREMENTAL).replaceAll(""));
                    C8195l c8195l4 = new C8195l("X-Crashlytics-OS-Display-Version", c11155l.f22430l.matcher(Build.VERSION.RELEASE).replaceAll(""));
                    c0732l.crashlytics.getClass();
                    Map mapRemoteconfig = AbstractC8676l.remoteconfig(c8195l, c8195l2, c8195l3, c8195l4, new C8195l("X-Crashlytics-API-Client-Version", "3.0.4"));
                    Log.d("FirebaseSessions", "Fetching settings from server.");
                    C13335l c13335l = c0732l.amazon;
                    C7226l c7226l = new C7226l(c0732l, interfaceC14029l2, 12);
                    C2051l c2051l = new C2051l(i3, interfaceC14029l2, 11);
                    c9734l.f19862l = interfaceC1601l3;
                    c9734l.f19861l = null;
                    c9734l.f19860l = 3;
                    objFirebase = AbstractC10999l.firebase(c13335l.loadAd, new C0384l(c13335l, mapRemoteconfig, c7226l, c2051l, (InterfaceC14029l) null, 28), c9734l);
                    if (objFirebase == enumC9342l) {
                        objFirebase = Unit.INSTANCE;
                    }
                    if (objFirebase != enumC9342l) {
                        interfaceC1601l2 = interfaceC1601l3;
                        Unit unit3 = Unit.INSTANCE;
                        interfaceC1601l2.billing(null);
                        return Unit.INSTANCE;
                    }
                    return enumC9342l;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC1601l2 = interfaceC1601l4;
                    interfaceC1601l2.billing(null);
                    throw th;
                }
            }
            InterfaceC1601l interfaceC1601l5 = c9734l.f19861l;
            C0732l c0732l2 = (C0732l) c9734l.f19862l;
            AbstractC2829l.crashlytics(obj);
            interfaceC1601l = interfaceC1601l5;
            c0732l = c0732l2;
            if (!c0732l.purchase.loadAd()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                Unit unit4 = Unit.INSTANCE;
                interfaceC1601l.billing(null);
                return unit4;
            }
            C6565l c6565l = C0807l.crashlytics;
            InterfaceC6095l interfaceC6095l = c0732l.loadAd;
            c9734l.f19862l = c0732l;
            c9734l.f19861l = interfaceC1601l;
            c9734l.f19860l = 2;
            Object objSubscription = c6565l.subscription(interfaceC6095l, c9734l);
            if (objSubscription != enumC9342l) {
                interfaceC1601l3 = interfaceC1601l;
                obj = objSubscription;
                str = ((C0807l) obj).yandex;
                if (str.equals("")) {
                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    Unit unit5 = Unit.INSTANCE;
                    interfaceC1601l3.billing(null);
                    return unit5;
                }
                C8195l c8195l5 = new C8195l("X-Crashlytics-Installation-ID", str);
                String str3 = Build.MANUFACTURER + Build.MODEL;
                c0732l.getClass();
                C11155l c11155l2 = admob;
                C8195l c8195l6 = new C8195l("X-Crashlytics-Device-Model", c11155l2.f22430l.matcher(str3).replaceAll(""));
                C8195l c8195l7 = new C8195l("X-Crashlytics-OS-Build-Version", c11155l2.f22430l.matcher(Build.VERSION.INCREMENTAL).replaceAll(""));
                C8195l c8195l8 = new C8195l("X-Crashlytics-OS-Display-Version", c11155l2.f22430l.matcher(Build.VERSION.RELEASE).replaceAll(""));
                c0732l.crashlytics.getClass();
                Map mapRemoteconfig2 = AbstractC8676l.remoteconfig(c8195l5, c8195l6, c8195l7, c8195l8, new C8195l("X-Crashlytics-API-Client-Version", "3.0.4"));
                Log.d("FirebaseSessions", "Fetching settings from server.");
                C13335l c13335l2 = c0732l.amazon;
                C7226l c7226l2 = new C7226l(c0732l, interfaceC14029l2, 12);
                C2051l c2051l2 = new C2051l(i3, interfaceC14029l2, 11);
                c9734l.f19862l = interfaceC1601l3;
                c9734l.f19861l = null;
                c9734l.f19860l = 3;
                objFirebase = AbstractC10999l.firebase(c13335l2.loadAd, new C0384l(c13335l2, mapRemoteconfig2, c7226l2, c2051l2, (InterfaceC14029l) null, 28), c9734l);
                if (objFirebase == enumC9342l) {
                    objFirebase = Unit.INSTANCE;
                }
                if (objFirebase != enumC9342l) {
                    interfaceC1601l2 = interfaceC1601l3;
                    Unit unit6 = Unit.INSTANCE;
                    interfaceC1601l2.billing(null);
                    return Unit.INSTANCE;
                }
            }
            return enumC9342l;
        } catch (Throwable th3) {
            th = th3;
            interfaceC1601l2 = interfaceC1601l;
            interfaceC1601l2.billing(null);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC0844l
    public final Boolean yandex() {
        return this.purchase.yandex().yandex;
    }
}
