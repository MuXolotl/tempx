package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.metrica;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚّۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7221l implements InterfaceC9751l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final InterpolatorC9757l f15046l = new InterpolatorC9757l(0);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final InterpolatorC9757l f15047l = new InterpolatorC9757l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f15048l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f15049l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15050l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f15051l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f15052l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f15053l;

    public C7221l(C3625l c3625l, long j) {
        this.f15050l = 2;
        String str = c3625l.f7563l;
        C11522l c11522l = new C11522l((byte) 0, 3);
        c11522l.amazon = str;
        c11522l.loadAd = -1;
        c11522l.crashlytics = -1;
        this.f15053l = c11522l;
        this.f15049l = C12814l.mopub(j);
        this.f15048l = C12814l.billing(j);
        this.f15052l = -1;
        this.f15051l = -1;
        int iMopub = C12814l.mopub(j);
        int iBilling = C12814l.billing(j);
        if (iMopub < 0 || iMopub > str.length()) {
            C18262l.adcel(AbstractC12589l.premium(iMopub, str.length(), "start (", ") offset is outside of text region "));
            throw null;
        }
        if (iBilling < 0 || iBilling > str.length()) {
            C18262l.adcel(AbstractC12589l.premium(iBilling, str.length(), "end (", ") offset is outside of text region "));
            throw null;
        }
        if (iMopub <= iBilling) {
            return;
        }
        C8339l.metrica(AbstractC12589l.premium(iMopub, iBilling, "Do not set reversed range: ", " > "));
        throw null;
    }

    public static int billing(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public static int purchase(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public static void smaato(RecyclerView recyclerView, metrica metricaVar, float f, float f2, boolean z) {
        View view = metricaVar.yandex;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            Float fValueOf = Float.valueOf(view.getElevation());
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
                    float elevation = childAt.getElevation();
                    if (elevation > f3) {
                        f3 = elevation;
                    }
                }
            }
            view.setElevation(f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public void adcel(int i) {
        if (!(i >= 0)) {
            AbstractC1786l.yandex("Cannot set selectionEnd to a negative value: " + i);
        }
        this.f15048l = i;
    }

    public char admob(int i) {
        C11522l c11522l = (C11522l) this.f15053l;
        C14568l c14568l = (C14568l) c11522l.purchase;
        if (c14568l == null) {
            return ((String) c11522l.amazon).charAt(i);
        }
        if (i < c11522l.loadAd) {
            return ((String) c11522l.amazon).charAt(i);
        }
        int iYandex = c14568l.loadAd - c14568l.yandex();
        int i2 = c11522l.loadAd;
        if (i >= iYandex + i2) {
            return ((String) c11522l.amazon).charAt(i - ((iYandex - c11522l.crashlytics) + i2));
        }
        int i3 = i - i2;
        int i4 = c14568l.amazon;
        char[] cArr = c14568l.crashlytics;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + c14568l.purchase];
    }

    public void ads(int i) {
        if (!(i >= 0)) {
            AbstractC1786l.yandex("Cannot set selectionStart to a negative value: " + i);
        }
        this.f15049l = i;
    }

    @Override // defpackage.InterfaceC9751l
    public int amazon() {
        C13143l c13143l = (C13143l) this.f15053l;
        int i = this.f15048l;
        if (i == 8) {
            return c13143l.signatures();
        }
        if (i == 16) {
            return c13143l.m3567synchronized();
        }
        int i2 = this.f15052l;
        this.f15052l = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f15051l & 15;
        }
        int iSignatures = c13143l.signatures();
        this.f15051l = iSignatures;
        return (iSignatures & 240) >> 4;
    }

    @Override // defpackage.InterfaceC9751l
    public int crashlytics() {
        return this.f15049l;
    }

    public int firebase(RecyclerView recyclerView, int i, int i2, long j) {
        if (this.f15049l == -1) {
            this.f15049l = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (f15046l.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (f15047l.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.f15049l)));
        if (interpolation == 0) {
            return i2 > 0 ? 1 : -1;
        }
        return interpolation;
    }

    public int isPro(metrica metricaVar) {
        Object obj = metricaVar.subscription;
        int i = 0;
        if ((obj instanceof InterfaceC4364l) && ((InterfaceC4364l) obj).crashlytics()) {
            i = 3;
        }
        return (i << 16) | i;
    }

    @Override // defpackage.InterfaceC9751l
    public int loadAd() {
        return -1;
    }

    public void metrica(int i, int i2) {
        C11522l c11522l = (C11522l) this.f15053l;
        if (i < 0 || i > c11522l.premium()) {
            C18262l.adcel(AbstractC12589l.premium(i, c11522l.premium(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > c11522l.premium()) {
            C18262l.adcel(AbstractC12589l.premium(i2, c11522l.premium(), "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            C8339l.metrica(AbstractC12589l.premium(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.f15052l = i;
            this.f15051l = i2;
        }
    }

    public void mopub(int i, int i2) {
        long jLoadAd = AbstractC2296l.loadAd(i, i2);
        ((C11522l) this.f15053l).m3107final(i, i2, "");
        long jMopub = AbstractC11999l.mopub(AbstractC2296l.loadAd(this.f15049l, this.f15048l), jLoadAd);
        ads(C12814l.mopub(jMopub));
        adcel(C12814l.billing(jMopub));
        int i3 = this.f15052l;
        if (i3 != -1) {
            long jMopub2 = AbstractC11999l.mopub(AbstractC2296l.loadAd(i3, this.f15051l), jLoadAd);
            if (C12814l.amazon(jMopub2)) {
                this.f15052l = -1;
                this.f15051l = -1;
            } else {
                this.f15052l = C12814l.mopub(jMopub2);
                this.f15051l = C12814l.billing(jMopub2);
            }
        }
    }

    public long remoteconfig() {
        int i = this.f15052l;
        if (i == 0) {
            C4875l.firebase();
            return 0L;
        }
        long[] jArr = (long[]) this.f15053l;
        int i2 = this.f15049l;
        long j = jArr[i2];
        this.f15049l = this.f15051l & (i2 + 1);
        this.f15052l = i - 1;
        return j;
    }

    public void startapp(int i, int i2) {
        C11522l c11522l = (C11522l) this.f15053l;
        if (i < 0 || i > c11522l.premium()) {
            C18262l.adcel(AbstractC12589l.premium(i, c11522l.premium(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > c11522l.premium()) {
            C18262l.adcel(AbstractC12589l.premium(i2, c11522l.premium(), "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            C8339l.metrica(AbstractC12589l.premium(i, i2, "Do not set reversed range: ", " > "));
        } else {
            ads(i);
            adcel(i2);
        }
    }

    public C12814l subs() {
        int i = this.f15052l;
        if (i != -1) {
            return new C12814l(AbstractC2296l.loadAd(i, this.f15051l));
        }
        return null;
    }

    public String toString() {
        switch (this.f15050l) {
            case 2:
                return ((C11522l) this.f15053l).toString();
            default:
                return super.toString();
        }
    }

    public void vip(int i, int i2, String str) {
        C11522l c11522l = (C11522l) this.f15053l;
        if (i < 0 || i > c11522l.premium()) {
            C18262l.adcel(AbstractC12589l.premium(i, c11522l.premium(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > c11522l.premium()) {
            C18262l.adcel(AbstractC12589l.premium(i2, c11522l.premium(), "end (", ") offset is outside of text region "));
            return;
        }
        if (i > i2) {
            C8339l.metrica(AbstractC12589l.premium(i, i2, "Do not set reversed range: ", " > "));
            return;
        }
        c11522l.m3107final(i, i2, str);
        ads(str.length() + i);
        adcel(str.length() + i);
        this.f15052l = -1;
        this.f15051l = -1;
    }

    public void yandex(metrica metricaVar) {
        int i;
        View view = metricaVar.yandex;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            view.setElevation(fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        int i2 = this.f15052l;
        if (i2 != -1 && (i = this.f15051l) != -1 && i2 != i) {
            ((InterfaceC4364l) metricaVar.subscription).yandex(i);
        }
        this.f15048l = -1;
        this.f15052l = -1;
        this.f15051l = -1;
    }

    public /* synthetic */ C7221l(int i) {
        this.f15050l = i;
    }

    public C7221l(C10717l c10717l) {
        this.f15050l = 5;
        this.f15053l = c10717l;
        this.f15049l = Math.max(4, Runtime.getRuntime().availableProcessors() - 2);
        this.f15048l = 4;
        this.f15052l = -3;
        this.f15051l = -1;
    }

    public C7221l(C1770l c1770l) {
        this.f15050l = 0;
        this.f15049l = -1;
        this.f15053l = c1770l;
        this.f15048l = -1;
        this.f15052l = -1;
        this.f15051l = -1;
    }

    public C7221l(C16792l c16792l) {
        this.f15050l = 1;
        C13143l c13143l = c16792l.f32816l;
        this.f15053l = c13143l;
        c13143l.m3562for(12);
        this.f15048l = c13143l.inmobi() & 255;
        this.f15049l = c13143l.inmobi();
    }
}
