package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: renamed from: lؖ۠ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4443l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f9042l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f9043l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public AbstractC1030l[] f9044l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C6930l f9045l;

    public final void admob(AbstractC1030l abstractC1030l) {
        C6930l c6930l;
        int i;
        InterfaceC14029l[] interfaceC14029lArrLoadAd;
        synchronized (this) {
            try {
                int i2 = this.f9043l - 1;
                this.f9043l = i2;
                c6930l = this.f9045l;
                if (i2 == 0) {
                    this.f9042l = 0;
                }
                interfaceC14029lArrLoadAd = abstractC1030l.loadAd(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC14029l interfaceC14029l : interfaceC14029lArrLoadAd) {
            if (interfaceC14029l != null) {
                interfaceC14029l.subs(Unit.INSTANCE);
            }
        }
        if (c6930l != null) {
            c6930l.ad(-1);
        }
    }

    public abstract AbstractC1030l amazon();

    public final AbstractC1030l crashlytics() {
        AbstractC1030l abstractC1030lAmazon;
        C6930l c6930l;
        synchronized (this) {
            try {
                AbstractC1030l[] abstractC1030lArrPurchase = this.f9044l;
                if (abstractC1030lArrPurchase == null) {
                    abstractC1030lArrPurchase = purchase();
                    this.f9044l = abstractC1030lArrPurchase;
                } else if (this.f9043l >= abstractC1030lArrPurchase.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC1030lArrPurchase, abstractC1030lArrPurchase.length * 2);
                    this.f9044l = (AbstractC1030l[]) objArrCopyOf;
                    abstractC1030lArrPurchase = (AbstractC1030l[]) objArrCopyOf;
                }
                int i = this.f9042l;
                do {
                    abstractC1030lAmazon = abstractC1030lArrPurchase[i];
                    if (abstractC1030lAmazon == null) {
                        abstractC1030lAmazon = amazon();
                        abstractC1030lArrPurchase[i] = abstractC1030lAmazon;
                    }
                    i++;
                    if (i >= abstractC1030lArrPurchase.length) {
                        i = 0;
                    }
                } while (!abstractC1030lAmazon.yandex(this));
                this.f9042l = i;
                this.f9043l++;
                c6930l = this.f9045l;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c6930l != null) {
            c6930l.ad(1);
        }
        return abstractC1030lAmazon;
    }

    public abstract AbstractC1030l[] purchase();

    public final C6930l subs() {
        C6930l c6930l;
        synchronized (this) {
            c6930l = this.f9045l;
            if (c6930l == null) {
                int i = this.f9043l;
                c6930l = new C6930l(1, Alert.DURATION_SHOW_INDEFINITELY, 2);
                c6930l.mopub(Integer.valueOf(i));
                this.f9045l = c6930l;
            }
        }
        return c6930l;
    }
}
