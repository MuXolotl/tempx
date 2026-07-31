package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lٖٖٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceC16415l extends Service {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final HandlerC8616l f32105l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C5057l f32106l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C12014l f32108l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C3726l f32109l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C3726l f32112l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C1770l f32113l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C7996l f32114l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C12014l f32115l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C5008l f32107l = new C5008l(14, this);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C7996l f32104l = new C7996l(this, "android.media.session.MediaController", -1, -1, null);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ArrayList f32111l = new ArrayList();

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C11154l f32110l = new C11154l(0);

    public ServiceC16415l(C3726l c3726l) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        HandlerC8616l handlerC8616l = new HandlerC8616l(looperMyLooper);
        handlerC8616l.loadAd = this;
        this.f32105l = handlerC8616l;
        this.f32113l = C1770l.firebase(c3726l.billing);
        this.f32109l = c3726l;
        this.f32115l = new C12014l(c3726l);
        this.f32112l = c3726l;
    }

    public static C1090l yandex(ServiceC16415l serviceC16415l, C9201l c9201l) throws Throwable {
        Object obj;
        AbstractC12442l.metrica(c9201l, "LibraryResult must not be null");
        C1090l c1090l = new C1090l();
        if (c9201l.yandex != 0 || (obj = c9201l.crashlytics) == null) {
            c1090l.smaato(null);
            return c1090l;
        }
        AbstractC1186l abstractC1186l = (AbstractC1186l) obj;
        if (abstractC1186l.isEmpty()) {
            c1090l.smaato(new ArrayList());
            return c1090l;
        }
        ArrayList arrayList = new ArrayList();
        RunnableC12388l runnableC12388l = new RunnableC12388l(c1090l, arrayList, 11);
        EnumC1535l enumC1535l = EnumC1535l.f3808l;
        c1090l.yandex(runnableC12388l, enumC1535l);
        RunnableC4063l runnableC4063l = new RunnableC4063l(serviceC16415l, new AtomicInteger(0), abstractC1186l, arrayList, c1090l);
        for (int i = 0; i < abstractC1186l.size(); i++) {
            byte[] bArr = ((C2427l) abstractC1186l.get(i)).amazon.firebase;
            if (bArr == null) {
                arrayList.add(null);
                runnableC4063l.run();
            } else {
                ListenableFuture listenableFutureMo1119try = serviceC16415l.f32112l.remoteconfig.mo1119try(bArr);
                arrayList.add(listenableFutureMo1119try);
                listenableFutureMo1119try.yandex(runnableC4063l, enumC1535l);
            }
        }
        return c1090l;
    }

    public final void amazon(String str, AbstractC14330l abstractC14330l, Bundle bundle) {
        C6499l c6499lLoadAd = loadAd();
        if (c6499lLoadAd == null) {
            abstractC14330l.billing(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            abstractC14330l.yandex();
            AbstractC15323l.m3966final(this.f32112l.smaato, new RunnableC0295l(this, c6499lLoadAd, abstractC14330l, bundle, str));
        } else {
            AbstractC6427l.vip("MLSLegacyStub", "onLoadChildren(): Ignoring empty parentId from " + c6499lLoadAd);
            abstractC14330l.billing(null);
        }
    }

    public final void billing(String str) {
        C6499l c6499lLoadAd = loadAd();
        if (c6499lLoadAd == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            AbstractC15323l.m3966final(this.f32112l.smaato, new RunnableC10613l(this, c6499lLoadAd, str, 24));
            return;
        }
        AbstractC6427l.vip("MLSLegacyStub", "onUnsubscribe(): Ignoring empty id from " + c6499lLoadAd);
    }

    public final void crashlytics(C5057l c5057l) {
        attachBaseContext(this.f32109l.billing);
        onCreate();
        if (c5057l == null) {
            C8339l.metrica("Session token may not be null");
            return;
        }
        if (this.f32106l != null) {
            C8339l.smaato("The session token has already been set");
            return;
        }
        this.f32106l = c5057l;
        C12014l c12014l = this.f32108l;
        c12014l.getClass();
        ((ServiceC16415l) c12014l.f23943l).f32105l.amazon(new RunnableC9929l(c12014l, c5057l, false, 12));
    }

    public final C6499l loadAd() {
        C12014l c12014l = this.f32108l;
        c12014l.getClass();
        return this.f32115l.license(c12014l.pro());
    }

    public final void mopub(String str, C7996l c7996l, Bundle bundle, Bundle bundle2) {
        C10185l c10185l = new C10185l(this, str, c7996l, str, bundle, bundle2);
        this.f32114l = c7996l;
        if (bundle == null) {
            amazon(str, c10185l, null);
        } else {
            amazon(str, c10185l, bundle);
        }
        this.f32114l = null;
        if (c10185l.loadAd()) {
            return;
        }
        C8339l.smaato(AbstractC9361l.ad(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), c7996l.yandex, " id=", str));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C12014l c12014l = this.f32108l;
        c12014l.getClass();
        C14932l c14932l = (C14932l) c12014l.f23940l;
        c14932l.getClass();
        return c14932l.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f32108l = new C2559l(this);
        } else if (i >= 26) {
            this.f32108l = new C4479l(this);
        } else {
            this.f32108l = new C12014l(this);
        }
        this.f32108l.mo1552catch();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f32105l.loadAd = null;
    }

    public final void purchase(String str, AbstractC14330l abstractC14330l) {
        C6499l c6499lLoadAd = loadAd();
        if (c6499lLoadAd == null) {
            abstractC14330l.billing(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            abstractC14330l.yandex();
            AbstractC15323l.m3966final(this.f32112l.smaato, new RunnableC10613l(this, c6499lLoadAd, abstractC14330l, str));
        } else {
            AbstractC6427l.vip("MLSLegacyStub", "Ignoring empty itemId from " + c6499lLoadAd);
            abstractC14330l.billing(null);
        }
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
