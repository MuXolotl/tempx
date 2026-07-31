package defpackage;

import android.os.SystemClock;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.crypto.KeyAgreement;

/* JADX INFO: renamed from: lُؔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10819l implements InterfaceC2165l, InterfaceC7664l, InterfaceC12841l, InterfaceC0251l, InterfaceC4005l, InterfaceC17377l, InterfaceC0612l, InterfaceC12690l, InterfaceC15244l, InterfaceC9765l, InterfaceC18099l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21877l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C10819l f21871l = new C10819l(15);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C10819l f21868l = new C10819l(17);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C10819l f21874l = new C10819l(18);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C10819l f21873l = new C10819l(19);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C10819l f21876l = new C10819l(20);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C10819l f21869l = new C10819l(21);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C10819l f21870l = new C10819l(22);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ C10819l f21875l = new C10819l(23);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final /* synthetic */ C10819l f21872l = new C10819l(24);

    public /* synthetic */ C10819l(int i) {
        this.f21877l = i;
    }

    public static final boolean firebase(C14025l c14025l) {
        C14025l c14025l2 = C18131l.f35441l;
        return !AbstractC16648l.Signature(c14025l.loadAd(), ".class", true);
    }

    public static C14025l metrica(C14025l c14025l, C14025l c14025l2) {
        return C18131l.f35441l.purchase(AbstractC12024l.m3334new(c14025l.f27331l.tapsense(), c14025l2.f27331l.tapsense()).replace('\\', '/'));
    }

    @Override // defpackage.InterfaceC17377l
    public long crashlytics() {
        return System.nanoTime() / 1000;
    }

    @Override // defpackage.InterfaceC17377l
    public long isPro() {
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }

    @Override // defpackage.InterfaceC2165l
    public Object loadAd(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }

    @Override // defpackage.InterfaceC12841l
    public boolean mopub() {
        boolean z;
        synchronized (C11910l.yandex) {
            try {
                int i = C11910l.crashlytics;
                C11910l.crashlytics = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > C11910l.amazon + 30000) {
                    C11910l.crashlytics = 0;
                    C11910l.amazon = SystemClock.uptimeMillis();
                    String[] list = C11910l.loadAd.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    C11910l.purchase = list.length < 800;
                }
                z = C11910l.purchase;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC7664l
    public C2106l purchase() {
        C2106l c2106l = C2106l.f4733l;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis / 1000;
        if ((jCurrentTimeMillis ^ 1000) < 0 && j * 1000 != jCurrentTimeMillis) {
            j--;
        }
        long j2 = jCurrentTimeMillis % 1000;
        int i = (int) ((j2 + (1000 & (((j2 ^ 1000) & ((-j2) | j2)) >> 63))) * 1000000);
        if (j < -31557014167219200L) {
            return C2106l.f4733l;
        }
        return j > 31556889864403199L ? C2106l.f4734l : C16367l.license(j, i);
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        return new ExecutorServiceC18081l();
    }

    @Override // defpackage.InterfaceC0251l
    public StackTraceElement[] smaato(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, stackTraceElementArr2, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        return stackTraceElementArr2;
    }

    public AbstractC10794l vip(InterfaceC1925l interfaceC1925l, List list) {
        List parameters = interfaceC1925l.getParameters();
        InterfaceC16902l interfaceC16902l = (InterfaceC16902l) AbstractC16901l.m4212class(parameters);
        if (interfaceC16902l != null) {
            int i = 1;
            if (interfaceC16902l.mo2181l()) {
                List parameters2 = interfaceC1925l.getParameters();
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(parameters2, 10));
                Iterator it = parameters2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC16902l) it.next()).metrica());
                }
                return new C13105l(i, AbstractC8676l.subscription(AbstractC16901l.m4226l(list, arrayList)));
            }
        }
        return new C0232l((InterfaceC16902l[]) parameters.toArray(new InterfaceC16902l[0]), (AbstractC4946l[]) list.toArray(new AbstractC4946l[0]), false);
    }

    @Override // defpackage.InterfaceC12841l
    public boolean yandex(C9192l c9192l) {
        InterfaceC18382l interfaceC18382l = c9192l.yandex;
        boolean z = interfaceC18382l instanceof C12881l;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        if ((z ? ((C12881l) interfaceC18382l).yandex : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        InterfaceC18382l interfaceC18382l2 = c9192l.loadAd;
        if (interfaceC18382l2 instanceof C12881l) {
            i = ((C12881l) interfaceC18382l2).yandex;
        }
        return i > 100;
    }

    @Override // defpackage.InterfaceC9765l
    public Object zza() {
        switch (this.f21877l) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(100000L, 20, "measurement.store.max_stored_events_per_app").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list2 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(1000L, 49, "measurement.sgtm.upload.min_delay_after_broadcast").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list3 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(15000L, 64, "measurement.upload.initial_upload_delay_time").get();
            case 20:
                List list4 = AbstractC5981l.yandex;
                C12737l.f25103l.get();
                C17516l c17516l = C1801l.yandex;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) c17516l.f34134l;
                AbstractC0342l abstractC0342l = (AbstractC0342l) atomicReferenceArray.get(2);
                if (abstractC0342l == null) {
                    C2307l c2307l = new C2307l("measurement.test.double_flag", (C18096l) ((C3529l) c17516l.f34133l).f7425l);
                    while (!atomicReferenceArray.compareAndSet(2, null, c2307l)) {
                        if (atomicReferenceArray.get(2) != null) {
                            abstractC0342l = (AbstractC0342l) atomicReferenceArray.get(2);
                            abstractC0342l.getClass();
                        }
                    }
                    abstractC0342l = c2307l;
                }
                return (Double) abstractC0342l.get();
            case 21:
                List list5 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (String) C4515l.yandex.mopub("measurement.rb.attribution.app_allowlist", 32, "").get();
            case 22:
                List list6 = AbstractC5981l.yandex;
                return (Boolean) C8775l.loadAd.get();
            case 23:
                List list7 = AbstractC5981l.yandex;
                return (Boolean) C2096l.yandex.get();
            default:
                return new Boolean(((Boolean) C17184l.yandex.get()).booleanValue());
        }
    }

    @Override // defpackage.InterfaceC0612l
    public /* synthetic */ void advert() {
    }

    @Override // defpackage.InterfaceC0612l
    public /* synthetic */ void applovin() {
    }

    @Override // defpackage.InterfaceC0612l
    public /* synthetic */ void subs() {
    }

    @Override // defpackage.InterfaceC4005l
    public int admob(int i) {
        return i;
    }

    @Override // defpackage.InterfaceC4005l
    public int amazon(int i) {
        return i;
    }

    @Override // defpackage.InterfaceC0612l
    public /* synthetic */ void billing(C15074l c15074l) {
    }
}
