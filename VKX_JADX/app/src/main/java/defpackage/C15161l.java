package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٔۛٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15161l implements InterfaceC0930l, InterfaceC17883l {
    public final C14338l crashlytics;
    public Integer firebase;
    public boolean isPro;
    public final InterfaceC6688l loadAd;
    public long mopub;
    public InterfaceC16983l purchase;
    public Integer smaato;
    public final C15736l yandex;
    public final Object amazon = new Object();
    public final ArrayList billing = new ArrayList();
    public int admob = 2;
    public int subs = 1;

    public C15161l(C15736l c15736l, InterfaceC6688l interfaceC6688l, C14338l c14338l) {
        this.yandex = c15736l;
        this.loadAd = interfaceC6688l;
        this.crashlytics = c14338l;
    }

    public final int amazon(int i, boolean z, Integer num) {
        int iYandex;
        if (num != null) {
            iYandex = num.intValue();
        } else if (i != 0) {
            iYandex = i != 1 ? 1 : 3;
        } else {
            iYandex = this.loadAd.yandex();
        }
        if (z) {
            if (Build.VERSION.SDK_INT >= 28 && AbstractC6159l.amazon(this.yandex.loadAd, 5) == 5) {
                if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "State3AControl.invalidate: trying external flash AE mode.");
                }
                iYandex = 5;
            }
        }
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "State3AControl.getFinalPreferredAeMode: preferAeMode = " + iYandex);
        }
        return iYandex;
    }

    public final C9426l billing() {
        C9426l c9426l = new C9426l();
        C17078l c17078l = new C17078l();
        synchronized (this.amazon) {
            this.billing.add(c9426l);
            long j = this.mopub + 1;
            this.mopub = j;
            c17078l.f33243l = j;
            Unit unit = Unit.INSTANCE;
        }
        AbstractC10999l.mopub(this.crashlytics.purchase, null, 0, new C7864l((InterfaceC14029l) null, this, c17078l, 21), 3);
        return c9426l;
    }

    public final void crashlytics(Exception exc) {
        List listM4213const;
        synchronized (this.amazon) {
            listM4213const = AbstractC16901l.m4213const(this.billing);
            this.billing.clear();
        }
        Iterator it = listM4213const.iterator();
        while (it.hasNext()) {
            ((C9426l) it.next()).m2649l(exc);
        }
    }

    @Override // defpackage.InterfaceC0930l
    public final void loadAd(InterfaceC16983l interfaceC16983l) {
        this.purchase = interfaceC16983l;
        billing();
    }

    public final int purchase() {
        int iAmazon;
        synchronized (this.amazon) {
            iAmazon = AbstractC6159l.amazon(this.yandex.loadAd, amazon(this.admob, this.isPro, this.firebase));
        }
        return iAmazon;
    }

    @Override // defpackage.InterfaceC0930l
    public final void reset() {
        synchronized (this.amazon) {
            this.isPro = false;
            this.firebase = null;
            this.smaato = null;
            this.admob = 2;
            this.subs = 1;
            Unit unit = Unit.INSTANCE;
        }
        billing();
    }

    @Override // defpackage.InterfaceC17883l
    public final void yandex(LinkedHashSet linkedHashSet) {
        InterfaceC14029l interfaceC14029l = null;
        AbstractC10999l.mopub(this.crashlytics.purchase, null, 0, new C7864l(interfaceC14029l, AbstractC16901l.m4229l(linkedHashSet), this, 20), 3);
    }
}
