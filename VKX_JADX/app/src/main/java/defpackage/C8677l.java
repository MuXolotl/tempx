package defpackage;

import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: lٌٍُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8677l implements InterfaceC16975l, InterfaceC12052l, InterfaceC18679l, InterfaceC1775l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f17867l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f17868l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17869l;

    public /* synthetic */ C8677l(int i, Serializable serializable, int i2) {
        this.f17869l = i2;
        this.f17868l = i;
        this.f17867l = serializable;
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        C9201l c9201lLoadAd;
        C6499l c6499l = (C6499l) this.f17867l;
        int i = this.f17868l;
        try {
            c9201lLoadAd = (C9201l) ((ListenableFuture) obj).get();
            AbstractC12442l.metrica(c9201lLoadAd, "LibraryResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            AbstractC6427l.metrica("MediaSessionStub", "Library operation failed", e);
            c9201lLoadAd = C9201l.loadAd(-1);
        } catch (CancellationException e2) {
            AbstractC6427l.metrica("MediaSessionStub", "Library operation cancelled", e2);
            c9201lLoadAd = C9201l.loadAd(1);
        } catch (ExecutionException e3) {
            e = e3;
            AbstractC6427l.metrica("MediaSessionStub", "Library operation failed", e);
            c9201lLoadAd = C9201l.loadAd(-1);
        }
        try {
            InterfaceC3270l interfaceC3270l = c6499l.amazon;
            interfaceC3270l.getClass();
            interfaceC3270l.firebase(i, c9201lLoadAd);
        } catch (RemoteException e4) {
            AbstractC6427l.metrica("MediaSessionStub", "Failed to send result to browser " + c6499l, e4);
        }
    }

    @Override // defpackage.InterfaceC12052l
    public void amazon(C13208l c13208l) {
        int i = this.f17869l;
        Object obj = this.f17867l;
        int i2 = this.f17868l;
        switch (i) {
            case 3:
                C16811l c16811l = c13208l.yandex;
                AbstractC1186l abstractC1186l = (AbstractC1186l) obj;
                if (c13208l.mo319l()) {
                    C13708l c13708l = c13208l.Signature;
                    C13708l c13708l2 = c13208l.license;
                    c13208l.tapsense = AbstractC1186l.Signature(abstractC1186l);
                    C13708l c13708lM3589l = C13208l.m3589l(abstractC1186l, c13208l.subscription, c13208l.pro, c13208l.isVip, c13208l.f25987strictfp);
                    c13208l.Signature = c13708lM3589l;
                    c13208l.license = C13208l.m3594l(c13708lM3589l, c13208l.subscription, c13208l.f25987strictfp, c13208l.pro, c13208l.isVip, c13208l.m3611l());
                    boolean zEquals = c13208l.Signature.equals(c13708l);
                    c13208l.license.equals(c13708l2);
                    c16811l.getClass();
                    AbstractC12442l.subscription(Looper.myLooper() == c16811l.f32839l.getLooper());
                    InterfaceC14026l interfaceC14026l = c16811l.f32840l;
                    C5113l c5113lAd = interfaceC14026l.ad(c16811l, c13208l.license);
                    if (!zEquals) {
                        interfaceC14026l.isVip();
                    }
                    c13208l.m3601l(i2, c5113lAd);
                    break;
                }
                break;
            default:
                C16811l c16811l2 = c13208l.yandex;
                List list = (List) obj;
                if (c13208l.mo319l()) {
                    C13708l c13708l3 = c13208l.Signature;
                    C13708l c13708l4 = c13208l.license;
                    c13208l.subscription = AbstractC1186l.Signature(list);
                    C13708l c13708lM3589l2 = C13208l.m3589l(c13208l.tapsense, list, c13208l.pro, c13208l.isVip, c13208l.f25987strictfp);
                    c13208l.Signature = c13708lM3589l2;
                    c13208l.license = C13208l.m3594l(c13708lM3589l2, list, c13208l.f25987strictfp, c13208l.pro, c13208l.isVip, c13208l.m3611l());
                    boolean zEquals2 = c13208l.Signature.equals(c13708l3);
                    c13208l.license.equals(c13708l4);
                    c16811l2.getClass();
                    AbstractC12442l.subscription(Looper.myLooper() == c16811l2.f32839l.getLooper());
                    InterfaceC14026l interfaceC14026l2 = c16811l2.f32840l;
                    C5113l c5113lAd2 = interfaceC14026l2.ad(c16811l2, c13208l.license);
                    if (!zEquals2) {
                        interfaceC14026l2.isVip();
                    }
                    c13208l.m3601l(i2, c5113lAd2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        switch (this.f17869l) {
            case 1:
                ((InterfaceC13521l) obj).mo2745volatile(((C10749l) this.f17867l).yandex, this.f17868l);
                break;
            default:
                InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
                interfaceC13521l.ads(this.f17868l, (C2427l) this.f17867l);
                break;
        }
    }

    @Override // defpackage.InterfaceC1775l
    public boolean loadAd(View view) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f17867l;
        int i = this.f17868l;
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC0653l.ads(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = sideSheetBehavior.startapp;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.subscription(i);
            return true;
        }
        View view2 = (View) sideSheetBehavior.startapp.get();
        RunnableC9534l runnableC9534l = new RunnableC9534l(sideSheetBehavior, i, 12);
        ViewParent parent = view2.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            if (view2.isAttachedToWindow()) {
                view2.post(runnableC9534l);
                return true;
            }
        }
        runnableC9534l.run();
        return true;
    }

    public InterfaceC16228l yandex() {
        String str = (String) this.f17867l;
        int i = this.f17868l;
        return new C10975l(16, i == 1 ? new C2325l(Executors.newSingleThreadExecutor(new ThreadFactoryC17493l(str, 1))) : new C2325l(Executors.newFixedThreadPool(i)));
    }

    public /* synthetic */ C8677l(Object obj, int i, int i2) {
        this.f17869l = i2;
        this.f17867l = obj;
        this.f17868l = i;
    }
}
