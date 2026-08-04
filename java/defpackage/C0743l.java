package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import androidx.car.app.hardware.ICarHardwareHost;
import androidx.car.app.isPro;
import androidx.car.app.utils.billing;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٟؑۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0743l implements InterfaceC6610l, InterfaceC16975l, InterfaceC7456l, InterfaceC11724l, InterfaceC12052l, InterfaceC0119l, InterfaceC18679l, InterfaceC12350l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f2241l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f2242l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2243l;

    public /* synthetic */ C0743l(int i, Object obj, Object obj2) {
        this.f2243l = i;
        this.f2242l = obj;
        this.f2241l = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        C5159l c5159l;
        int i;
        C3726l c3726l = (C3726l) this.f2242l;
        C6499l c6499l = (C6499l) this.f2241l;
        try {
            c5159l = (C5159l) ((ListenableFuture) obj).get();
            AbstractC12442l.metrica(c5159l, "SessionResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            AbstractC6427l.metrica("MediaSessionStub", "Session operation failed", e);
            if (e.getCause() instanceof UnsupportedOperationException) {
                i = -6;
            } else {
                i = -1;
            }
            c5159l = new C5159l(i);
        } catch (CancellationException e2) {
            AbstractC6427l.metrica("MediaSessionStub", "Session operation cancelled", e2);
            c5159l = new C5159l(1);
        } catch (ExecutionException e3) {
            e = e3;
            AbstractC6427l.metrica("MediaSessionStub", "Session operation failed", e);
            if (e.getCause() instanceof UnsupportedOperationException) {
                i = -6;
            } else {
                i = -1;
            }
            c5159l = new C5159l(i);
        }
        BinderC4841l.m1620l(c3726l, c6499l, this.f2243l, c5159l);
    }

    @Override // defpackage.InterfaceC12052l
    public void amazon(C13208l c13208l) {
        C12417l c12417l = (C12417l) this.f2242l;
        Bundle bundle = (Bundle) this.f2241l;
        C16811l c16811l = c13208l.yandex;
        if (c13208l.mo319l()) {
            c16811l.getClass();
            AbstractC12442l.subscription(Looper.myLooper() == c16811l.f32839l.getLooper());
            C5113l c5113lSubscription = c16811l.f32840l.subscription(c16811l, c12417l, bundle);
            c5113lSubscription.yandex(new RunnableC2027l(c13208l, c5113lSubscription, this.f2243l, 6), EnumC1535l.f3808l);
        }
    }

    @Override // defpackage.InterfaceC11724l
    public void billing(InterfaceC4725l interfaceC4725l, int i) {
        C13208l c13208l = (C13208l) this.f2242l;
        List list = (List) this.f2241l;
        BinderC11857l binderC11857l = c13208l.crashlytics;
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c16971lMetrica.crashlytics(((C2427l) list.get(i2)).crashlytics(c13208l.m3611l(), true));
        }
        interfaceC4725l.mo458l(binderC11857l, i, this.f2243l, new BinderC11373l(c16971lMetrica.mopub()));
    }

    @Override // defpackage.InterfaceC6610l
    public Object call() {
        C12565l c12565l = (C12565l) this.f2242l;
        C15858l c15858l = (C15858l) this.f2241l;
        ICarHardwareHost iCarHardwareHost = c12565l.loadAd;
        if (iCarHardwareHost == null) {
            isPro ispro = c12565l.yandex;
            C18353l c18353l = new C18353l(21);
            ispro.getClass();
            iCarHardwareHost = (ICarHardwareHost) billing.purchase("getHost(CarHardware)", new C0615l(ispro, "car", "getHost(CarHardware)", c18353l));
            Objects.requireNonNull(iCarHardwareHost);
            c12565l.loadAd = iCarHardwareHost;
        }
        iCarHardwareHost.unsubscribeCarHardwareResult(this.f2243l, c15858l);
        return null;
    }

    @Override // defpackage.InterfaceC0119l
    public void crashlytics(C6499l c6499l) {
        C13350l c13350l = (C13350l) this.f2242l;
        C0579l c0579l = (C0579l) this.f2241l;
        if (TextUtils.isEmpty(c0579l.f1992l)) {
            AbstractC6427l.vip("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        ListenableFuture listenableFutureAds = c13350l.admob.ads(c6499l, AbstractC1186l.isVip(AbstractC18585l.isPro(c0579l)));
        ((C8149l) listenableFutureAds).yandex(new RunnableC9929l(listenableFutureAds, new C13698l(c13350l, c6499l, this.f2243l), 9), EnumC1535l.f3808l);
    }

    @Override // defpackage.InterfaceC7456l
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public Object mo672default(C5807l c5807l) {
        InterfaceC12932l interfaceC12932l = (InterfaceC12932l) this.f2242l;
        Function2 function2 = (Function2) this.f2241l;
        c5807l.yandex(new RunnableC11297l(15, (InterfaceC7042l) interfaceC12932l.mo245l(C1083l.f2996l)), EnumC13705l.f26759l);
        return AbstractC10999l.mopub(AbstractC11990l.yandex(interfaceC12932l), null, this.f2243l, new C4647l(function2, c5807l, (InterfaceC14029l) null), 1);
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        C4262l c4262l = (C4262l) this.f2242l;
        C4262l c4262l2 = (C4262l) this.f2241l;
        InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
        int i = this.f2243l;
        interfaceC13521l.isPro(i);
        interfaceC13521l.firebase(c4262l, c4262l2, i);
    }

    @Override // defpackage.InterfaceC12350l
    public Object purchase() {
        C7644l c7644l = (C7644l) this.f2242l;
        ((C10111l) c7644l.f15740l).m2883strictfp((C4330l) this.f2241l, this.f2243l + 1, false);
        return null;
    }

    public /* synthetic */ C0743l(Object obj, int i, Object obj2) {
        this.f2242l = obj;
        this.f2243l = i;
        this.f2241l = obj2;
    }

    public /* synthetic */ C0743l(Object obj, Object obj2, int i) {
        this.f2242l = obj;
        this.f2241l = obj2;
        this.f2243l = i;
    }
}
