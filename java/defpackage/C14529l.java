package defpackage;

import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: lٓۤۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14529l implements InterfaceC2053l, InterfaceC17619l, InterfaceC15446l, InterfaceC11989l, InterfaceC14341l, InterfaceC9765l, InterfaceC8086l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28442l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C14529l f28437l = new C14529l(16);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C14529l f28434l = new C14529l(17);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C14529l f28439l = new C14529l(18);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C14529l f28438l = new C14529l(19);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C14529l f28441l = new C14529l(20);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C14529l f28435l = new C14529l(21);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C14529l f28436l = new C14529l(22);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ C14529l f28440l = new C14529l(23);

    public /* synthetic */ C14529l(int i) {
        this.f28442l = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r11[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r11[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008c, code lost:
    
        if (r11[r13] <= (-65)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int purchase(byte[] r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14529l.purchase(byte[], int, int, int):int");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object amazon(String str, AbstractC0283l abstractC0283l) throws Throwable {
        C4542l c4542l;
        if (abstractC0283l instanceof C4542l) {
            c4542l = (C4542l) abstractC0283l;
            int i = c4542l.f9180l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4542l.f9180l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4542l = new C4542l(this, abstractC0283l);
            }
        } else {
            c4542l = new C4542l(this, abstractC0283l);
        }
        Object objFirebase = c4542l.f9179l;
        int i2 = c4542l.f9180l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            if (!AbstractC16648l.isVip(str, "http", false)) {
                C12382l c12382l = AbstractC5921l.f12465l;
                String str2 = C14025l.f27330l;
                return new C11270l(4, new C1503l(c12382l.mo692default(C6162l.adcel(str, false))));
            }
            c4542l.f9180l = 1;
            C16552l c16552l = AbstractC11463l.yandex;
            objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C0790l(str, null), c4542l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objFirebase);
        }
        return ((C18389l) objFirebase).f35907l.mo1516l().mo713l();
    }

    @Override // defpackage.InterfaceC8086l
    public Object apply(Object obj) {
        switch (this.f28442l) {
            case 22:
                AbstractC6909l abstractC6909l = (AbstractC6909l) obj;
                abstractC6909l.getClass();
                try {
                    AbstractC17187l abstractC17187l = (AbstractC17187l) abstractC6909l;
                    int iPurchase = abstractC17187l.purchase();
                    byte[] bArr = new byte[iPurchase];
                    C9720l c9720l = new C9720l(bArr, iPurchase);
                    InterfaceC0101l interfaceC0101lYandex = C12765l.crashlytics.yandex(abstractC17187l.getClass());
                    C2290l c2290l = c9720l.crashlytics;
                    if (c2290l == null) {
                        c2290l = new C2290l(c9720l);
                    }
                    interfaceC0101lYandex.crashlytics(abstractC17187l, c2290l);
                    if (iPurchase - c9720l.billing == 0) {
                        return bArr;
                    }
                    throw new IllegalStateException("Did not write as much data as expected.");
                } catch (IOException e) {
                    String name = abstractC6909l.getClass().getName();
                    C18073l.Signature(AbstractC9361l.ad(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
                    return null;
                }
            default:
                return (byte[]) obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object crashlytics(String str, AbstractC0283l abstractC0283l) throws Throwable {
        C11917l c11917l;
        if (abstractC0283l instanceof C11917l) {
            c11917l = (C11917l) abstractC0283l;
            int i = c11917l.f23762l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11917l.f23762l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11917l = new C11917l(this, abstractC0283l);
            }
        } else {
            c11917l = new C11917l(this, abstractC0283l);
        }
        Object objFirebase = c11917l.f23761l;
        int i2 = c11917l.f23762l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            if (!AbstractC16648l.isVip(str, "http", false)) {
                C12382l c12382l = AbstractC5921l.f12465l;
                String str2 = C14025l.f27330l;
                return new C1503l(c12382l.mo692default(C6162l.adcel(str, false)));
            }
            c11917l.f23762l = 1;
            C16552l c16552l = AbstractC11463l.yandex;
            objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C0790l(str, null), c11917l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objFirebase);
        }
        return ((C18389l) objFirebase).f35907l.mo1516l();
    }

    @Override // defpackage.InterfaceC2053l
    public void firebase() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r6v8, types: [byte[], java.io.Serializable] */
    public Serializable loadAd(String str, AbstractC0283l abstractC0283l) throws Throwable {
        C0439l c0439l;
        if (abstractC0283l instanceof C0439l) {
            c0439l = (C0439l) abstractC0283l;
            int i = c0439l.f1613l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0439l.f1613l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0439l = new C0439l(this, abstractC0283l);
            }
        } else {
            c0439l = new C0439l(this, abstractC0283l);
        }
        Object objFirebase = c0439l.f1612l;
        int i2 = c0439l.f1613l;
        ?? r2 = 0;
        Throwable th = null;
        r2 = 0;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            if (!AbstractC16648l.isVip(str, "http", false)) {
                C12382l c12382l = AbstractC5921l.f12465l;
                String str2 = C14025l.f27330l;
                InterfaceC14991l interfaceC14991lMo692default = c12382l.mo692default(C6162l.adcel(str, false));
                C0869l c0869l = new C0869l();
                try {
                    c0869l.mo736volatile(interfaceC14991lMo692default);
                    byte[] bArrM725package = c0869l.m725package(c0869l.f2526l);
                    try {
                        ((C15900l) interfaceC14991lMo692default).close();
                        c0869l.yandex();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    Throwable th3 = th;
                    r2 = bArrM725package;
                    th = th3;
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        ((C15900l) interfaceC14991lMo692default).close();
                        c0869l.yandex();
                    } catch (Throwable th5) {
                        AbstractC11718l.yandex(th, th5);
                    }
                }
                if (th == null) {
                    return r2;
                }
                throw th;
            }
            c0439l.f1613l = 1;
            C16552l c16552l = AbstractC11463l.yandex;
            objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C0790l(str, null), c0439l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objFirebase);
        }
        Closeable closeable = (Closeable) objFirebase;
        try {
            ?? Yandex = ((C18389l) closeable).f35907l.yandex();
            AbstractC7876l.loadAd(closeable, null);
            return Yandex;
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                AbstractC7876l.loadAd(closeable, th6);
                throw th7;
            }
        }
    }

    @Override // defpackage.InterfaceC2053l
    public InterfaceC8979l startapp(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC2053l
    public void tapsense(InterfaceC12703l interfaceC12703l) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        switch (this.f28442l) {
            case 9:
                int iHashCode = hashCode();
                AbstractC8576l.loadAd(16);
                return AbstractC14814l.ads("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", AbstractC18202l.yandex.loadAd(InterfaceC0798l.class).license(), ">");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC17619l
    public InterfaceC11449l yandex(C4619l c4619l) {
        return new C1611l((Context) c4619l.f9373l, (String) c4619l.f9372l, (C14785l) c4619l.f9374l, c4619l.f9370l, c4619l.f9369l);
    }

    @Override // defpackage.InterfaceC9765l
    public Object zza() {
        switch (this.f28442l) {
            case 16:
                List list = AbstractC5981l.yandex;
                return (String) C12384l.yandex.get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list2 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(21600000L, 52, "measurement.sgtm.upload.retry_max_wait").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list3 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(1000L, 9, "measurement.upload.debug_upload_interval").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list4 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(1000L, 38, "measurement.service_client.reconnect_millis").get();
            case 20:
                List list5 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(7L, 26, "measurement.rb.attribution.client.min_ad_services_version").get()).longValue());
            case 21:
                List list6 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(1000L, 24, "measurement.rb.max_trigger_registrations_per_day").get()).longValue());
            default:
                List list7 = AbstractC5981l.yandex;
                return (Boolean) C16132l.loadAd.get();
        }
    }
}
