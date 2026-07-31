package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* JADX INFO: renamed from: lٍؒۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1298l implements InterfaceC4930l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f3346l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f3347l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f3348l = true;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f3349l;

    @Override // defpackage.InterfaceC4930l
    public void amazon(Object obj) {
        final C9896l c9896l = (C9896l) obj;
        C3726l c3726l = ((C13350l) this.f3349l).admob;
        Handler handler = c3726l.smaato;
        final C6499l c6499l = (C6499l) this.f3346l;
        final boolean z = this.f3348l;
        final boolean z2 = this.f3347l;
        AbstractC15323l.m3966final(handler, new RunnableC12388l(c3726l, c6499l, new Runnable() { // from class: lٍۣ۟
            @Override // java.lang.Runnable
            public final void run() {
                C3726l c3726l2 = ((C13350l) this.f20185l.f3349l).admob;
                C18602l c18602l = c3726l2.tapsense;
                AbstractC8672l.billing(c18602l, c9896l);
                int iPurchase = c18602l.purchase();
                if (z) {
                    if (iPurchase == 1) {
                        if (c18602l.mo2779l(2)) {
                            c18602l.yandex();
                        }
                    } else if (iPurchase == 4 && c18602l.mo2779l(4)) {
                        c18602l.premium();
                    }
                }
                boolean z3 = z2;
                if (z3 && c18602l.mo2779l(1)) {
                    c18602l.mo2801protected();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i : new int[]{31, 2}) {
                    AbstractC12442l.subscription(!false);
                    sparseBooleanArray.append(i, true);
                }
                if (z3) {
                    AbstractC12442l.subscription(!false);
                    sparseBooleanArray.append(1, true);
                }
                AbstractC12442l.subscription(!false);
                c3726l2.signatures(c6499l);
            }
        }));
    }

    public void billing(EnumC18016l... enumC18016lArr) {
        if (!this.f3348l) {
            C8339l.metrica("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(enumC18016lArr.length);
        for (EnumC18016l enumC18016l : enumC18016lArr) {
            arrayList.add(enumC18016l.f35224l);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f3348l) {
            C8339l.metrica("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.f3349l = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            C8339l.metrica("At least one TLS version is required");
        }
    }

    public AbstractC1091l[] crashlytics(Handler handler, SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l, SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l2, SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l3, SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l4) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.f3346l;
        boolean z = this.f3348l;
        C16265l c16265l = new C16265l(context);
        C7947l c7947l = (C7947l) this.f3349l;
        c16265l.crashlytics = c7947l;
        c16265l.amazon = 5000L;
        c16265l.purchase = z;
        c16265l.billing = handler;
        c16265l.mopub = surfaceHolderCallbackC18330l;
        c16265l.admob = 50;
        AbstractC12442l.subscription(!c16265l.loadAd);
        Handler handler2 = c16265l.billing;
        AbstractC12442l.subscription((handler2 == null && c16265l.mopub == null) || !(handler2 == null || c16265l.mopub == null));
        c16265l.loadAd = true;
        arrayList.add(new C11727l(c16265l));
        boolean z2 = this.f3347l;
        C3512l c3512l = new C3512l(context);
        c3512l.yandex = z2;
        AbstractC12442l.subscription(!c3512l.loadAd);
        c3512l.loadAd = true;
        if (((C10111l) c3512l.amazon) == null) {
            c3512l.amazon = new C10111l(new InterfaceC15103l[0]);
        }
        C4856l c4856l = (C4856l) c3512l.billing;
        C15289l c15289l = (C15289l) c3512l.mopub;
        if (c4856l == null) {
            if (c15289l == null) {
                c3512l.mopub = new C15289l(context);
            }
            if (((C14823l) c3512l.purchase) == null) {
                c3512l.purchase = C14823l.f29009l;
            }
            C1796l c1796l = new C1796l();
            c1796l.loadAd = context.getApplicationContext();
            c1796l.amazon = C14823l.f29009l;
            c1796l.yandex = 8.0f;
            Context context2 = (Context) c1796l.loadAd;
            if (context2 == null) {
                c1796l.purchase = null;
            }
            C15289l c15289l2 = (C15289l) c3512l.mopub;
            c1796l.crashlytics = c15289l2;
            c1796l.amazon = (C14823l) c3512l.purchase;
            if (c15289l2 == null) {
                c1796l.crashlytics = new C15289l(context2);
            }
            c3512l.billing = new C4856l(c1796l);
        } else {
            AbstractC12442l.subscription(c15289l == null);
            AbstractC12442l.subscription(((C14823l) c3512l.purchase) == null);
        }
        arrayList.add(new C4886l(context, c7947l, this.f3348l, handler, surfaceHolderCallbackC18330l2, new C7653l(c3512l)));
        arrayList.add(new C1945l(surfaceHolderCallbackC18330l3, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new C5431l(surfaceHolderCallbackC18330l4, looper));
        }
        arrayList.add(new C4698l());
        arrayList.add(new C2876l(new C13161l(context)));
        return (AbstractC1091l[]) arrayList.toArray(new AbstractC1091l[0]);
    }

    public void loadAd(C5628l... c5628lArr) {
        if (!this.f3348l) {
            C8339l.metrica("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(c5628lArr.length);
        for (C5628l c5628l : c5628lArr) {
            arrayList.add(c5628l.yandex);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f3348l) {
            C8339l.metrica("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.f3346l = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            C8339l.metrica("At least one cipher suite is required");
        }
    }

    public String purchase() {
        String next = ((Scanner) this.f3346l).next();
        if (this.f3348l && !this.f3347l) {
            if (!next.isEmpty() && next.charAt(0) == 65279) {
                next = next.substring(1);
            }
            this.f3347l = true;
        }
        StringBuilder sb = (StringBuilder) this.f3349l;
        sb.append(next);
        sb.append("\n");
        return next;
    }

    public C4800l yandex() {
        return new C4800l(this.f3348l, this.f3347l, (String[]) this.f3346l, (String[]) this.f3349l);
    }

    @Override // defpackage.InterfaceC4930l
    public void mopub(Throwable th) {
    }
}
