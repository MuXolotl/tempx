package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lٕٜۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15951l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f31317l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f31318l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f31319l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f31320l;

    public AbstractC15951l() {
        if (C2183l.f4823l == null) {
            C2183l.f4823l = new C2183l(13);
        }
    }

    public abstract boolean admob(Object obj, Object obj2);

    public abstract Object amazon(View view);

    public void billing() {
        while (true) {
            int i = this.f31319l;
            C17963l c17963l = (C17963l) this.f31320l;
            if (i >= c17963l.f34967l || c17963l.f34957l[i] >= 0) {
                return;
            } else {
                this.f31319l = i + 1;
            }
        }
    }

    public void crashlytics() {
        if (((C17963l) this.f31320l).f34959l == this.f31317l) {
            return;
        }
        C8339l.mopub();
    }

    public boolean hasNext() {
        return this.f31319l < ((C17963l) this.f31320l).f34967l;
    }

    public void mopub(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f31318l) {
            purchase(view, obj);
            return;
        }
        C10156l c10156l = null;
        if (Build.VERSION.SDK_INT >= this.f31318l) {
            tag = amazon(view);
        } else {
            tag = view.getTag(this.f31319l);
            if (!((Class) this.f31320l).isInstance(tag)) {
                tag = null;
            }
        }
        if (admob(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateAmazon = AbstractC15872l.amazon(view);
            if (accessibilityDelegateAmazon != null) {
                c10156l = accessibilityDelegateAmazon instanceof C14990l ? ((C14990l) accessibilityDelegateAmazon).yandex : new C10156l(accessibilityDelegateAmazon);
            }
            if (c10156l == null) {
                c10156l = new C10156l();
            }
            AbstractC15872l.vip(view, c10156l);
            view.setTag(this.f31319l, obj);
            AbstractC15872l.admob(view, this.f31317l);
        }
    }

    public abstract void purchase(View view, Object obj);

    public void remove() {
        C17963l c17963l = (C17963l) this.f31320l;
        crashlytics();
        if (this.f31318l == -1) {
            C8339l.smaato("Call next() before removing element from the iterator.");
            return;
        }
        c17963l.amazon();
        c17963l.firebase(this.f31318l);
        this.f31318l = -1;
        this.f31317l = c17963l.f34959l;
    }

    public int yandex(int i) {
        if (i < this.f31317l) {
            return ((ByteBuffer) this.f31320l).getShort(this.f31318l + i);
        }
        return 0;
    }
}
