package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.LogCallback;
import java.io.File;
import java.security.Provider;
import java.security.Signature;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙُؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C6162l implements InterfaceC0729l, InterfaceC2165l, LogCallback, InterfaceC9840l, InterfaceC5706l, InterfaceC5304l, InterfaceC10315l, InterfaceC4701l, InterfaceC9765l, InterfaceC15244l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12980l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C6162l f12976l = new C6162l(16);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C6162l f12973l = new C6162l(17);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C6162l f12978l = new C6162l(18);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C6162l f12977l = new C6162l(19);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C6162l f12979l = new C6162l(20);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C6162l f12974l = new C6162l(21);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C6162l f12975l = new C6162l(23);

    public /* synthetic */ C6162l(int i) {
        this.f12980l = i;
    }

    public static C14025l adcel(String str, boolean z) {
        C3844l c3844l = billing.yandex;
        C0869l c0869l = new C0869l();
        c0869l.m718l(str);
        return billing.amazon(c0869l, z);
    }

    public static C14025l ads(File file) {
        return adcel(file.toString(), false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|34) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        r1 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        r12.f21792l = r11;
        r12.f21791l = r3;
        r12.f21790l = 1;
        r0 = defpackage.AbstractC8532l.purchase(r3, r12);
        r1 = defpackage.EnumC9342l.f19165l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r0 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006b -> B:27:0x006f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object startapp(java.io.FileOutputStream r11, defpackage.AbstractC0283l r12) throws java.io.IOException {
        /*
            boolean r0 = r12 instanceof defpackage.C10757l
            if (r0 == 0) goto L13
            r0 = r12
            lُؐٞ r0 = (defpackage.C10757l) r0
            int r1 = r0.f21790l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21790l = r1
            goto L18
        L13:
            lُؐٞ r0 = new lُؐٞ
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f21793l
            int r1 = r0.f21790l
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2a
            long r3 = r0.f21791l
            java.io.FileOutputStream r11 = r0.f21792l
            defpackage.AbstractC2829l.crashlytics(r12)
            r12 = r0
            goto L6f
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r11)
            r11 = 0
            return r11
        L31:
            defpackage.AbstractC2829l.crashlytics(r12)
            r3 = 10
            r12 = r0
        L37:
            r0 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L74
            java.nio.channels.FileChannel r5 = r11.getChannel()     // Catch: java.io.IOException -> L4f
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r11 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L4f
            goto L84
        L4f:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L73
            java.lang.String r5 = "Resource deadlock would occur"
            r6 = 0
            boolean r1 = defpackage.AbstractC12024l.appmetrica(r1, r5, r6)
            if (r1 != r2) goto L73
            r12.f21792l = r11
            r12.f21791l = r3
            r12.f21790l = r2
            java.lang.Object r0 = defpackage.AbstractC8532l.purchase(r3, r12)
            lٍؗؐ r1 = defpackage.EnumC9342l.f19165l
            if (r0 != r1) goto L6f
            r11 = r1
            goto L84
        L6f:
            r0 = 2
            long r3 = r3 * r0
            goto L37
        L73:
            throw r0
        L74:
            java.nio.channels.FileChannel r5 = r11.getChannel()
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r11 = r5.lock(r6, r8, r10)
        L84:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6162l.startapp(java.io.FileOutputStream, lّؑۧ):java.lang.Object");
    }

    public static final boolean tapsense() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // defpackage.InterfaceC4701l
    public long admob() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.InterfaceC0729l
    public /* synthetic */ InterfaceC12888l amazon(C13281l c13281l, C5978l c5978l) {
        return InterfaceC12888l.remoteconfig;
    }

    @Override // defpackage.InterfaceC10315l
    public Object billing(Object obj) {
        C2582l c2582l;
        List list = (List) obj;
        int iIntValue = ((Integer) list.get(0)).intValue();
        int iIntValue2 = ((Integer) list.get(1)).intValue();
        int iIntValue3 = ((Integer) list.get(2)).intValue();
        C10227l c10227lAdmob = AbstractC14055l.admob();
        int i = 3;
        while (true) {
            int i2 = iIntValue2 + 3;
            c2582l = C0574l.subs;
            if (i >= i2) {
                break;
            }
            c10227lAdmob.add(c2582l.billing(list.get(i)));
            i++;
        }
        C10227l c10227lPurchase = AbstractC14055l.purchase(c10227lAdmob);
        C10227l c10227lAdmob2 = AbstractC14055l.admob();
        while (i < iIntValue2 + iIntValue3 + 3) {
            c10227lAdmob2.add(c2582l.billing(list.get(i)));
            i++;
        }
        return new C9106l(iIntValue, c10227lPurchase, AbstractC14055l.purchase(c10227lAdmob2));
    }

    @Override // defpackage.InterfaceC0729l
    public InterfaceC9655l crashlytics(C13281l c13281l, C5978l c5978l) {
        if (c5978l.subscription == null) {
            return null;
        }
        return new C5269l(new C4684l(6001, new C18628l()));
    }

    @Override // defpackage.InterfaceC9840l
    public C11911l getKey() {
        return C0720l.f2208l;
    }

    @Override // defpackage.InterfaceC5304l
    public InterfaceC17215l isPro(C5978l c5978l) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.InterfaceC2165l
    public Object loadAd(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }

    @Override // io.realm.kotlin.internal.interop.LogCallback
    public void log(short s, String str, String str2) {
        InterfaceC12493l.yandex.getClass();
        InterfaceC12493l interfaceC12493l = (InterfaceC12493l) AbstractC1303l.yandex.get(str);
        int iYandex = AbstractC1303l.yandex(AbstractC3461l.remoteconfig(s));
        Object[] objArr = new Object[0];
        Iterator it = C12320l.loadAd.iterator();
        while (it.hasNext()) {
            ((C15045l) it.next()).yandex(interfaceC12493l, iYandex, str2, Arrays.copyOf(objArr, 0));
        }
    }

    @Override // defpackage.InterfaceC5304l
    public int metrica(C5978l c5978l) {
        return 1;
    }

    @Override // defpackage.InterfaceC5304l
    public boolean mopub(C5978l c5978l) {
        return false;
    }

    @Override // defpackage.InterfaceC9840l
    public Object purchase(AbstractC10598l abstractC10598l, Function1 function1) {
        C14187l c14187l = (C14187l) abstractC10598l;
        C0720l c0720l = new C0720l(c14187l);
        function1.invoke(c0720l);
        c14187l.firebase(C6731l.f14090l, new C7306l(c0720l, false, null, 8));
        return c0720l;
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        return new C6664l((Context) c11644l.remoteconfig(Context.class));
    }

    @Override // defpackage.InterfaceC0729l
    public int smaato(C5978l c5978l) {
        return c5978l.subscription != null ? 1 : 0;
    }

    @Override // defpackage.InterfaceC10315l
    public Object subs(C15543l c15543l, Object obj) {
        C2582l c2582l;
        C9106l c9106l = (C9106l) obj;
        C10227l c10227lAdmob = AbstractC14055l.admob();
        c10227lAdmob.add(Integer.valueOf(c9106l.yandex));
        C11362l c11362l = c9106l.loadAd;
        c10227lAdmob.add(Integer.valueOf(c11362l.size()));
        C11362l c11362l2 = c9106l.crashlytics;
        c10227lAdmob.add(Integer.valueOf(c11362l2.size()));
        int size = c11362l.size();
        int i = 0;
        while (true) {
            c2582l = C0574l.subs;
            if (i >= size) {
                break;
            }
            c10227lAdmob.add(c2582l.subs(c15543l, c11362l.get(i)));
            i++;
        }
        int size2 = c11362l2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c10227lAdmob.add(c2582l.subs(c15543l, c11362l2.get(i2)));
        }
        return AbstractC14055l.purchase(c10227lAdmob);
    }

    public boolean subscription(CharSequence charSequence) {
        return false;
    }

    public String toString() {
        switch (this.f12980l) {
            case 10:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9765l
    public Object zza() {
        switch (this.f12980l) {
            case 16:
                return new Boolean(((Boolean) C0584l.yandex.get()).booleanValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (String) C4515l.yandex.mopub("measurement.sgtm.service_upload_apps_list", 44, "").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list2 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(43200000L, 63, "measurement.upload.backoff_period").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list3 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(605000L, 15, "measurement.upload.google_signal_max_queue_time").get();
            case 20:
                List list4 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(100L, 3, "measurement.max_bundles_per_iteration").get()).longValue());
            case 21:
                List list5 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(864000000L, 57, "measurement.rb.attribution.max_queue_time").get();
            default:
                List list6 = AbstractC5981l.yandex;
                C2156l.f4791l.get();
                return (Boolean) C18242l.yandex.yandex("measurement.rb.attribution.enable_trigger_redaction", true, 7).get();
        }
    }

    @Override // defpackage.InterfaceC0729l
    public /* synthetic */ void release() {
    }

    @Override // defpackage.InterfaceC0729l
    public /* synthetic */ void yandex() {
    }

    @Override // defpackage.InterfaceC0729l
    public void firebase(Looper looper, C17849l c17849l) {
    }
}
