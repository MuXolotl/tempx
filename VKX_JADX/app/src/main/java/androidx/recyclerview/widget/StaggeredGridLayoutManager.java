package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.car.app.model.Alert;
import defpackage.AbstractC0962l;
import defpackage.AbstractC11994l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15872l;
import defpackage.C10975l;
import defpackage.C13036l;
import defpackage.C13052l;
import defpackage.C13645l;
import defpackage.C14791l;
import defpackage.C14902l;
import defpackage.C15685l;
import defpackage.C18339l;
import defpackage.C4870l;
import defpackage.C5278l;
import defpackage.C5932l;
import defpackage.C8339l;
import defpackage.C9292l;
import defpackage.InterfaceC9662l;
import defpackage.RunnableC5360l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends isPro implements InterfaceC9662l {
    public int Signature;
    public final C13052l[] adcel;
    public final AbstractC0962l ads;
    public final BitSet advert;
    public final int applovin;
    public boolean appmetrica;
    public boolean inmobi;
    public final C18339l license;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final RunnableC5360l f444native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final Rect f445package;
    public final C13645l premium;
    public boolean pro;
    public final int startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final boolean f446strictfp;
    public final AbstractC0962l subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final C4870l f447synchronized;
    public final int tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public C5278l f448throws;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public int[] f449volatile;
    public boolean ad = false;
    public int isVip = -1;
    public int signatures = RecyclerView.UNDEFINED_DURATION;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.startapp = -1;
        this.pro = false;
        C13645l c13645l = new C13645l(16, false);
        this.premium = c13645l;
        this.applovin = 2;
        this.f445package = new Rect();
        this.f447synchronized = new C4870l(this);
        this.f446strictfp = true;
        this.f444native = new RunnableC5360l(23, this);
        C9292l c9292lM127private = isPro.m127private(context, attributeSet, i, i2);
        int i3 = c9292lM127private.yandex;
        if (i3 != 0 && i3 != 1) {
            C8339l.metrica("invalid orientation.");
            throw null;
        }
        crashlytics(null);
        if (i3 != this.tapsense) {
            this.tapsense = i3;
            AbstractC0962l abstractC0962l = this.ads;
            this.ads = this.subscription;
            this.subscription = abstractC0962l;
            m141l();
        }
        int i4 = c9292lM127private.loadAd;
        crashlytics(null);
        if (i4 != this.startapp) {
            c13645l.adcel();
            m141l();
            this.startapp = i4;
            this.advert = new BitSet(this.startapp);
            this.adcel = new C13052l[this.startapp];
            for (int i5 = 0; i5 < this.startapp; i5++) {
                this.adcel[i5] = new C13052l(this, i5);
            }
            m141l();
        }
        boolean z = c9292lM127private.crashlytics;
        crashlytics(null);
        C5278l c5278l = this.f448throws;
        if (c5278l != null && c5278l.f11381l != z) {
            c5278l.f11381l = z;
        }
        this.pro = z;
        m141l();
        C18339l c18339l = new C18339l();
        c18339l.yandex = true;
        c18339l.billing = 0;
        c18339l.mopub = 0;
        this.license = c18339l;
        this.ads = AbstractC0962l.yandex(this, this.tapsense);
        this.subscription = AbstractC0962l.yandex(this, 1 - this.tapsense);
    }

    /* JADX INFO: renamed from: lٕۗٞ, reason: contains not printable characters */
    public static int m93l(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: abstract */
    public final void mo25abstract() {
        this.premium.adcel();
        m141l();
    }

    @Override // androidx.recyclerview.widget.isPro
    public final int ad(firebase firebaseVar, C5932l c5932l) {
        if (this.tapsense == 1) {
            return Math.min(this.startapp, c5932l.loadAd());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.isPro
    public final void admob(int i, int i2, C5932l c5932l, crashlytics crashlyticsVar) {
        C18339l c18339l;
        int iMopub;
        if (this.tapsense != 0) {
            i = i2;
        }
        if (license() == 0 || i == 0) {
            return;
        }
        m109l(i, c5932l);
        int[] iArr = this.f449volatile;
        int i3 = this.startapp;
        if (iArr == null || iArr.length < i3) {
            this.f449volatile = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            c18339l = this.license;
            if (i4 >= i3) {
                break;
            }
            int i6 = c18339l.amazon;
            C13052l[] c13052lArr = this.adcel;
            if (i6 == -1) {
                int i7 = c18339l.billing;
                iMopub = i7 - c13052lArr[i4].isPro(i7);
            } else {
                iMopub = c13052lArr[i4].mopub(c18339l.mopub) - c18339l.mopub;
            }
            if (iMopub >= 0) {
                this.f449volatile[i5] = iMopub;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f449volatile, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = c18339l.crashlytics;
            if (i9 < 0 || i9 >= c5932l.loadAd()) {
                return;
            }
            crashlyticsVar.yandex(c18339l.crashlytics, this.f449volatile[i8]);
            c18339l.crashlytics += c18339l.amazon;
        }
    }

    @Override // androidx.recyclerview.widget.isPro
    public final C13036l ads() {
        return this.tapsense == 0 ? new C14791l(-2, -1) : new C14791l(-1, -2);
    }

    @Override // androidx.recyclerview.widget.isPro
    public final boolean amazon() {
        return this.tapsense == 0;
    }

    @Override // androidx.recyclerview.widget.isPro
    public final boolean billing(C13036l c13036l) {
        return c13036l instanceof C14791l;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: break */
    public final void mo59break(Parcelable parcelable) {
        if (parcelable instanceof C5278l) {
            C5278l c5278l = (C5278l) parcelable;
            this.f448throws = c5278l;
            if (this.isVip != -1) {
                c5278l.f11383l = -1;
                c5278l.f11382l = -1;
                c5278l.f11386l = null;
                c5278l.f11379l = 0;
                c5278l.f11385l = 0;
                c5278l.f11388l = null;
                c5278l.f11380l = null;
            }
            m141l();
        }
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: catch */
    public final boolean mo60catch() {
        return this.pro;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final void mo94class() {
        this.premium.adcel();
        for (int i = 0; i < this.startapp; i++) {
            this.adcel[i].crashlytics();
        }
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void mo95continue(int i) {
        super.mo95continue(i);
        for (int i2 = 0; i2 < this.startapp; i2++) {
            C13052l c13052l = this.adcel[i2];
            int i3 = c13052l.yandex;
            if (i3 != Integer.MIN_VALUE) {
                c13052l.yandex = i3 + i;
            }
            int i4 = c13052l.loadAd;
            if (i4 != Integer.MIN_VALUE) {
                c13052l.loadAd = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.isPro
    public final void crashlytics(String str) {
        if (this.f448throws == null) {
            super.crashlytics(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0046  */
    /* JADX WARN: Code duplicated, block: B:34:0x004d  */
    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: default */
    public final View mo26default(View view, int i, firebase firebaseVar, C5932l c5932l) {
        View viewFindContainingItemView;
        int i2;
        if (license() != 0) {
            RecyclerView recyclerView = this.loadAd;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.yandex.crashlytics.contains(viewFindContainingItemView)) {
                viewFindContainingItemView = null;
            }
            if (viewFindContainingItemView != null) {
                m115l();
                int i3 = this.tapsense;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
                                    i2 = 1;
                                }
                            } else if (i3 == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (i3 == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (i3 != 1 && m119l()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (i3 != 1 && m119l()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    C14791l c14791l = (C14791l) viewFindContainingItemView.getLayoutParams();
                    c14791l.getClass();
                    C13052l c13052l = c14791l.purchase;
                    int iM114l = i2 == 1 ? m114l() : m98l();
                    m112l(iM114l, c5932l);
                    m110l(i2);
                    C18339l c18339l = this.license;
                    c18339l.crashlytics = c18339l.amazon + iM114l;
                    c18339l.loadAd = (int) (this.ads.smaato() * 0.33333334f);
                    c18339l.admob = true;
                    c18339l.yandex = false;
                    m105l(firebaseVar, c18339l, c5932l);
                    this.appmetrica = this.ad;
                    View viewAdmob = c13052l.admob(iM114l, i2);
                    if (viewAdmob != null && viewAdmob != viewFindContainingItemView) {
                        return viewAdmob;
                    }
                    boolean zM118l = m118l(i2);
                    C13052l[] c13052lArr = this.adcel;
                    int i4 = this.startapp;
                    if (zM118l) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View viewAdmob2 = c13052lArr[i5].admob(iM114l, i2);
                            if (viewAdmob2 != null && viewAdmob2 != viewFindContainingItemView) {
                                return viewAdmob2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View viewAdmob3 = c13052lArr[i6].admob(iM114l, i2);
                            if (viewAdmob3 != null && viewAdmob3 != viewFindContainingItemView) {
                                return viewAdmob3;
                            }
                        }
                    }
                    boolean z = (this.pro ^ true) == (i2 == -1);
                    View viewAdcel = adcel(z ? c13052l.amazon() : c13052l.purchase());
                    if (viewAdcel != null && viewAdcel != viewFindContainingItemView) {
                        return viewAdcel;
                    }
                    if (m118l(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != c13052l.amazon) {
                                View viewAdcel2 = adcel(z ? c13052lArr[i7].amazon() : c13052lArr[i7].purchase());
                                if (viewAdcel2 != null && viewAdcel2 != viewFindContainingItemView) {
                                    return viewAdcel2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View viewAdcel3 = adcel(z ? c13052lArr[i8].amazon() : c13052lArr[i8].purchase());
                            if (viewAdcel3 != null && viewAdcel3 != viewFindContainingItemView) {
                                return viewAdcel3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: extends */
    public final int mo27extends(firebase firebaseVar, C5932l c5932l) {
        if (this.tapsense == 0) {
            return Math.min(this.startapp, c5932l.loadAd());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: final */
    public final void mo61final(AccessibilityEvent accessibilityEvent) {
        super.mo61final(accessibilityEvent);
        if (license() > 0) {
            View viewM99l = m99l(false);
            View viewM106l = m106l(false);
            if (viewM99l == null || viewM106l == null) {
                return;
            }
            int iM126native = isPro.m126native(viewM99l);
            int iM126native2 = isPro.m126native(viewM106l);
            if (iM126native < iM126native2) {
                accessibilityEvent.setFromIndex(iM126native);
                accessibilityEvent.setToIndex(iM126native2);
            } else {
                accessibilityEvent.setFromIndex(iM126native2);
                accessibilityEvent.setToIndex(iM126native);
            }
        }
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: finally */
    public final void mo28finally(int i, int i2) {
        m100l(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.isPro
    public final int firebase(C5932l c5932l) {
        return m113l(c5932l);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: import */
    public final void mo29import(int i, int i2) {
        m100l(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: instanceof */
    public final void mo30instanceof(int i, int i2) {
        m100l(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.isPro
    public final int isPro(C5932l c5932l) {
        if (license() == 0) {
            return 0;
        }
        boolean z = !this.f446strictfp;
        return AbstractC11994l.loadAd(c5932l, this.ads, m99l(z), m106l(z), this, this.f446strictfp);
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final void m96l(firebase firebaseVar, int i) {
        for (int iLicense = license() - 1; iLicense >= 0; iLicense--) {
            View viewSignature = Signature(iLicense);
            AbstractC0962l abstractC0962l = this.ads;
            if (abstractC0962l.purchase(viewSignature) < i || abstractC0962l.vip(viewSignature) < i) {
                return;
            }
            C14791l c14791l = (C14791l) viewSignature.getLayoutParams();
            c14791l.getClass();
            if (((ArrayList) c14791l.purchase.purchase).size() == 1) {
                return;
            }
            C13052l c13052l = c14791l.purchase;
            ArrayList arrayList = (ArrayList) c13052l.purchase;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C14791l c14791l2 = (C14791l) view.getLayoutParams();
            c14791l2.purchase = null;
            if (c14791l2.yandex.isPro() || c14791l2.yandex.remoteconfig()) {
                c13052l.crashlytics -= ((StaggeredGridLayoutManager) c13052l.billing).ads.crashlytics(view);
            }
            if (size == 1) {
                c13052l.yandex = RecyclerView.UNDEFINED_DURATION;
            }
            c13052l.loadAd = RecyclerView.UNDEFINED_DURATION;
            m144return(viewSignature, firebaseVar);
        }
    }

    /* JADX INFO: renamed from: lؑۨٝ, reason: contains not printable characters */
    public final void m97l(C13052l c13052l, int i, int i2) {
        int i3 = c13052l.crashlytics;
        int i4 = c13052l.amazon;
        BitSet bitSet = this.advert;
        if (i != -1) {
            int i5 = c13052l.loadAd;
            if (i5 == Integer.MIN_VALUE) {
                c13052l.loadAd();
                i5 = c13052l.loadAd;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c13052l.yandex;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) c13052l.purchase).get(0);
            C14791l c14791l = (C14791l) view.getLayoutParams();
            c13052l.yandex = ((StaggeredGridLayoutManager) c13052l.billing).ads.purchase(view);
            c14791l.getClass();
            i6 = c13052l.yandex;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
    public final int m98l() {
        if (license() == 0) {
            return 0;
        }
        return isPro.m126native(Signature(0));
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final int mo35l(int i, C5932l c5932l, firebase firebaseVar) {
        return m116l(i, c5932l, firebaseVar);
    }

    /* JADX INFO: renamed from: lؙؔؑ, reason: contains not printable characters */
    public final View m99l(boolean z) {
        AbstractC0962l abstractC0962l = this.ads;
        int iFirebase = abstractC0962l.firebase();
        int iMopub = abstractC0962l.mopub();
        int iLicense = license();
        View view = null;
        for (int i = 0; i < iLicense; i++) {
            View viewSignature = Signature(i);
            int iPurchase = abstractC0962l.purchase(viewSignature);
            if (abstractC0962l.loadAd(viewSignature) > iFirebase && iPurchase < iMopub) {
                if (iPurchase >= iFirebase || !z) {
                    return viewSignature;
                }
                if (view == null) {
                    view = viewSignature;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lؔٙؕ */
    public final void mo66l(int i) {
        C5278l c5278l = this.f448throws;
        if (c5278l != null && c5278l.f11383l != i) {
            c5278l.f11386l = null;
            c5278l.f11379l = 0;
            c5278l.f11383l = -1;
            c5278l.f11382l = -1;
        }
        this.isVip = i;
        this.signatures = RecyclerView.UNDEFINED_DURATION;
        m141l();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d A[LOOP:0: B:23:0x003c->B:27:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074 A[LOOP:1: B:32:0x0063->B:36:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0051 A[EDGE_INSN: B:62:0x0051->B:29:0x0051 BREAK  A[LOOP:0: B:23:0x003c->B:27:0x004d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0078 A[EDGE_INSN: B:64:0x0078->B:38:0x0078 BREAK  A[LOOP:1: B:32:0x0063->B:36:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
    public final void m100l(int i, int i2, int i3) {
        int i4;
        int i5;
        C13645l c13645l;
        int[] iArr;
        int iM114l;
        ArrayList arrayList;
        int size;
        C14902l c14902l;
        int size2;
        int i6;
        int i7;
        int[] iArr2;
        int iM114l2 = this.ad ? m114l() : m98l();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            c13645l = this.premium;
            iArr = (int[]) c13645l.f26671l;
            if (iArr != null && i5 < iArr.length) {
                arrayList = (ArrayList) c13645l.f26670l;
                if (arrayList == null) {
                    i7 = -1;
                } else {
                    size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            c14902l = null;
                            break;
                        }
                        c14902l = (C14902l) ((ArrayList) c13645l.f26670l).get(size);
                        if (c14902l.f29313l == i5) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (c14902l != null) {
                        ((ArrayList) c13645l.f26670l).remove(c14902l);
                    }
                    size2 = ((ArrayList) c13645l.f26670l).size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size2) {
                            i6 = -1;
                            break;
                        } else if (((C14902l) ((ArrayList) c13645l.f26670l).get(i6)).f29313l >= i5) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 != -1) {
                        C14902l c14902l2 = (C14902l) ((ArrayList) c13645l.f26670l).get(i6);
                        ((ArrayList) c13645l.f26670l).remove(i6);
                        i7 = c14902l2.f29313l;
                    } else {
                        i7 = -1;
                    }
                }
                iArr2 = (int[]) c13645l.f26671l;
                if (i7 == -1) {
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = ((int[]) c13645l.f26671l).length;
                } else {
                    Arrays.fill((int[]) c13645l.f26671l, i5, Math.min(i7 + 1, iArr2.length), -1);
                }
            }
            if (i3 != 1) {
                c13645l.advert(i, i2);
            } else if (i3 != 2) {
                c13645l.isVip(i, i2);
            } else if (i3 == 8) {
                c13645l.isVip(i, 1);
                c13645l.advert(i2, 1);
            }
            if (i4 <= iM114l2) {
                return;
            }
            if (this.ad) {
                iM114l = m98l();
            } else {
                iM114l = m114l();
            }
            if (i5 <= iM114l) {
                m141l();
            }
        }
        i4 = i + i2;
        i5 = i;
        c13645l = this.premium;
        iArr = (int[]) c13645l.f26671l;
        if (iArr != null) {
            arrayList = (ArrayList) c13645l.f26670l;
            if (arrayList == null) {
                i7 = -1;
            } else {
                size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        c14902l = null;
                        break;
                    }
                    c14902l = (C14902l) ((ArrayList) c13645l.f26670l).get(size);
                    if (c14902l.f29313l == i5) {
                        break;
                        break;
                    }
                    size--;
                }
                if (c14902l != null) {
                    ((ArrayList) c13645l.f26670l).remove(c14902l);
                }
                size2 = ((ArrayList) c13645l.f26670l).size();
                i6 = 0;
                while (true) {
                    if (i6 < size2) {
                        i6 = -1;
                        break;
                    } else {
                        if (((C14902l) ((ArrayList) c13645l.f26670l).get(i6)).f29313l >= i5) {
                            break;
                            break;
                        }
                        i6++;
                    }
                }
                if (i6 != -1) {
                    C14902l c14902l3 = (C14902l) ((ArrayList) c13645l.f26670l).get(i6);
                    ((ArrayList) c13645l.f26670l).remove(i6);
                    i7 = c14902l3.f29313l;
                } else {
                    i7 = -1;
                }
            }
            iArr2 = (int[]) c13645l.f26671l;
            if (i7 == -1) {
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = ((int[]) c13645l.f26671l).length;
            } else {
                Arrays.fill((int[]) c13645l.f26671l, i5, Math.min(i7 + 1, iArr2.length), -1);
            }
        }
        if (i3 != 1) {
            c13645l.advert(i, i2);
        } else if (i3 != 2) {
            c13645l.isVip(i, i2);
        } else if (i3 == 8) {
            c13645l.isVip(i, 1);
            c13645l.advert(i2, 1);
        }
        if (i4 <= iM114l2) {
            return;
        }
        if (this.ad) {
            iM114l = m98l();
        } else {
            iM114l = m114l();
        }
        if (i5 <= iM114l) {
            m141l();
        }
    }

    /* JADX INFO: renamed from: lّؗؑ, reason: contains not printable characters */
    public final void m101l(firebase firebaseVar, C5932l c5932l, boolean z) {
        int iMopub;
        int iM108l = m108l(RecyclerView.UNDEFINED_DURATION);
        if (iM108l != Integer.MIN_VALUE && (iMopub = this.ads.mopub() - iM108l) > 0) {
            int i = iMopub - (-m116l(-iMopub, c5932l, firebaseVar));
            if (!z || i <= 0) {
                return;
            }
            this.ads.metrica(i);
        }
    }

    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    public final int m102l(int i) {
        int iIsPro = this.adcel[0].isPro(i);
        for (int i2 = 1; i2 < this.startapp; i2++) {
            int iIsPro2 = this.adcel[i2].isPro(i);
            if (iIsPro2 < iIsPro) {
                iIsPro = iIsPro2;
            }
        }
        return iIsPro;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002a A[SYNTHETIC] */
    /* JADX INFO: renamed from: lٍؘؘ, reason: contains not printable characters */
    public final View m103l() {
        boolean z;
        boolean z2;
        int iLicense = license();
        int i = iLicense - 1;
        int i2 = this.startapp;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        byte b = (this.tapsense == 1 && m119l()) ? (byte) 1 : (byte) -1;
        if (this.ad) {
            iLicense = -1;
        } else {
            i = 0;
        }
        int i3 = i < iLicense ? 1 : -1;
        while (i != iLicense) {
            View viewSignature = Signature(i);
            C14791l c14791l = (C14791l) viewSignature.getLayoutParams();
            boolean z3 = bitSet.get(c14791l.purchase.amazon);
            AbstractC0962l abstractC0962l = this.ads;
            if (z3) {
                C13052l c13052l = c14791l.purchase;
                if (this.ad) {
                    int i4 = c13052l.loadAd;
                    if (i4 == Integer.MIN_VALUE) {
                        c13052l.loadAd();
                        i4 = c13052l.loadAd;
                    }
                    if (i4 < abstractC0962l.mopub()) {
                        ((C14791l) ((View) AbstractC14814l.firebase(1, (ArrayList) c13052l.purchase)).getLayoutParams()).getClass();
                        return viewSignature;
                    }
                } else {
                    int i5 = c13052l.yandex;
                    ArrayList arrayList = (ArrayList) c13052l.purchase;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        C14791l c14791l2 = (C14791l) view.getLayoutParams();
                        c13052l.yandex = ((StaggeredGridLayoutManager) c13052l.billing).ads.purchase(view);
                        c14791l2.getClass();
                        i5 = c13052l.yandex;
                    }
                    if (i5 > abstractC0962l.firebase()) {
                        ((C14791l) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return viewSignature;
                    }
                }
                bitSet.clear(c14791l.purchase.amazon);
            }
            i += i3;
            if (i != iLicense) {
                View viewSignature2 = Signature(i);
                if (this.ad) {
                    int iLoadAd = abstractC0962l.loadAd(viewSignature);
                    int iLoadAd2 = abstractC0962l.loadAd(viewSignature2);
                    if (iLoadAd >= iLoadAd2) {
                        if (iLoadAd == iLoadAd2) {
                            if (c14791l.purchase.amazon - ((C14791l) viewSignature2.getLayoutParams()).purchase.amazon < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewSignature;
                }
                int iPurchase = abstractC0962l.purchase(viewSignature);
                int iPurchase2 = abstractC0962l.purchase(viewSignature2);
                if (iPurchase <= iPurchase2) {
                    if (iPurchase == iPurchase2) {
                        if (c14791l.purchase.amazon - ((C14791l) viewSignature2.getLayoutParams()).purchase.amazon < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewSignature;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lؘِٞ */
    public final boolean mo39l() {
        return this.f448throws == null;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0189  */
    /* JADX WARN: Code duplicated, block: B:108:0x018b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:254:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:265:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01de A[SYNTHETIC] */
    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final void m104l(firebase firebaseVar, C5932l c5932l, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        C5278l c5278l;
        int iLicense;
        int i2;
        int iM126native;
        int iM126native2;
        int iLicense2;
        boolean z4;
        int i3;
        boolean z5;
        C5278l c5278l2 = this.f448throws;
        C4870l c4870l = this.f447synchronized;
        if (!(c5278l2 == null && this.isVip == -1) && c5932l.loadAd() == 0) {
            m131implements(firebaseVar);
            c4870l.yandex();
            return;
        }
        boolean z6 = c4870l.purchase;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c4870l.mopub;
        boolean z7 = (z6 && this.isVip == -1 && this.f448throws == null) ? false : true;
        C13052l[] c13052lArr = this.adcel;
        int i4 = this.startapp;
        C13645l c13645l = this.premium;
        if (z7) {
            c4870l.yandex();
            C5278l c5278l3 = this.f448throws;
            AbstractC0962l abstractC0962l = this.ads;
            if (c5278l3 != null) {
                int i5 = c5278l3.f11379l;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            c13052lArr[i6].crashlytics();
                            C5278l c5278l4 = this.f448throws;
                            int iMopub = c5278l4.f11386l[i6];
                            if (iMopub != Integer.MIN_VALUE) {
                                iMopub += c5278l4.f11387l ? abstractC0962l.mopub() : abstractC0962l.firebase();
                            }
                            C13052l c13052l = c13052lArr[i6];
                            c13052l.yandex = iMopub;
                            c13052l.loadAd = iMopub;
                        }
                    } else {
                        c5278l3.f11386l = null;
                        c5278l3.f11379l = 0;
                        c5278l3.f11385l = 0;
                        c5278l3.f11388l = null;
                        c5278l3.f11380l = null;
                        c5278l3.f11383l = c5278l3.f11382l;
                    }
                }
                C5278l c5278l5 = this.f448throws;
                this.inmobi = c5278l5.f11384l;
                boolean z8 = c5278l5.f11381l;
                crashlytics(null);
                C5278l c5278l6 = this.f448throws;
                if (c5278l6 != null && c5278l6.f11381l != z8) {
                    c5278l6.f11381l = z8;
                }
                this.pro = z8;
                m141l();
                m115l();
                C5278l c5278l7 = this.f448throws;
                int i7 = c5278l7.f11383l;
                if (i7 != -1) {
                    this.isVip = i7;
                    c4870l.crashlytics = c5278l7.f11387l;
                } else {
                    c4870l.crashlytics = this.ad;
                }
                if (c5278l7.f11385l > 1) {
                    c13645l.f26671l = c5278l7.f11388l;
                    c13645l.f26670l = c5278l7.f11380l;
                }
            } else {
                m115l();
                c4870l.crashlytics = this.ad;
            }
            if (c5932l.mopub || (i3 = this.isVip) == -1) {
                if (this.appmetrica) {
                    int iLoadAd = c5932l.loadAd();
                    iLicense2 = license() - 1;
                    while (true) {
                        if (iLicense2 < 0) {
                            iM126native2 = 0;
                            break;
                        }
                        iM126native2 = isPro.m126native(Signature(iLicense2));
                        if (iM126native2 < 0 && iM126native2 < iLoadAd) {
                            break;
                        } else {
                            iLicense2--;
                        }
                    }
                } else {
                    int iLoadAd2 = c5932l.loadAd();
                    iLicense = license();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iLicense) {
                            iM126native2 = 0;
                            break;
                        }
                        iM126native = isPro.m126native(Signature(i2));
                        if (iM126native < 0 && iM126native < iLoadAd2) {
                            iM126native2 = iM126native;
                            break;
                        }
                        i2++;
                    }
                }
                c4870l.yandex = iM126native2;
                c4870l.loadAd = RecyclerView.UNDEFINED_DURATION;
                z4 = true;
            } else if (i3 < 0 || i3 >= c5932l.loadAd()) {
                this.isVip = -1;
                this.signatures = RecyclerView.UNDEFINED_DURATION;
                if (this.appmetrica) {
                    int iLoadAd3 = c5932l.loadAd();
                    iLicense2 = license() - 1;
                    while (true) {
                        if (iLicense2 < 0) {
                            iM126native2 = 0;
                            break;
                        } else {
                            iM126native2 = isPro.m126native(Signature(iLicense2));
                            if (iM126native2 < 0) {
                            }
                            iLicense2--;
                        }
                    }
                } else {
                    int iLoadAd4 = c5932l.loadAd();
                    iLicense = license();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iLicense) {
                            iM126native2 = 0;
                            break;
                        } else {
                            iM126native = isPro.m126native(Signature(i2));
                            if (iM126native < 0) {
                            }
                            i2++;
                        }
                    }
                }
                c4870l.yandex = iM126native2;
                c4870l.loadAd = RecyclerView.UNDEFINED_DURATION;
                z4 = true;
            } else {
                C5278l c5278l8 = this.f448throws;
                if (c5278l8 == null || c5278l8.f11383l == -1 || c5278l8.f11379l < 1) {
                    View viewAdcel = adcel(this.isVip);
                    if (viewAdcel != null) {
                        c4870l.yandex = this.ad ? m114l() : m98l();
                        if (this.signatures != Integer.MIN_VALUE) {
                            if (c4870l.crashlytics) {
                                c4870l.loadAd = (abstractC0962l.mopub() - this.signatures) - abstractC0962l.loadAd(viewAdcel);
                            } else {
                                c4870l.loadAd = (abstractC0962l.firebase() + this.signatures) - abstractC0962l.purchase(viewAdcel);
                            }
                        } else if (abstractC0962l.crashlytics(viewAdcel) > abstractC0962l.smaato()) {
                            c4870l.loadAd = c4870l.crashlytics ? abstractC0962l.mopub() : abstractC0962l.firebase();
                        } else {
                            int iPurchase = abstractC0962l.purchase(viewAdcel) - abstractC0962l.firebase();
                            if (iPurchase < 0) {
                                c4870l.loadAd = -iPurchase;
                            } else {
                                int iMopub2 = abstractC0962l.mopub() - abstractC0962l.loadAd(viewAdcel);
                                if (iMopub2 < 0) {
                                    c4870l.loadAd = iMopub2;
                                } else {
                                    c4870l.loadAd = RecyclerView.UNDEFINED_DURATION;
                                }
                            }
                        }
                    } else {
                        int i8 = this.isVip;
                        c4870l.yandex = i8;
                        int i9 = this.signatures;
                        if (i9 == Integer.MIN_VALUE) {
                            if (license() != 0) {
                                if ((i8 < m98l()) != this.ad) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                            } else if (this.ad) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            c4870l.crashlytics = z5;
                            AbstractC0962l abstractC0962l2 = staggeredGridLayoutManager.ads;
                            c4870l.loadAd = z5 ? abstractC0962l2.mopub() : abstractC0962l2.firebase();
                        } else {
                            boolean z9 = c4870l.crashlytics;
                            AbstractC0962l abstractC0962l3 = staggeredGridLayoutManager.ads;
                            if (z9) {
                                c4870l.loadAd = abstractC0962l3.mopub() - i9;
                            } else {
                                c4870l.loadAd = abstractC0962l3.firebase() + i9;
                            }
                        }
                        z4 = true;
                        c4870l.amazon = true;
                    }
                } else {
                    c4870l.loadAd = RecyclerView.UNDEFINED_DURATION;
                    c4870l.yandex = this.isVip;
                }
                z4 = true;
            }
            c4870l.purchase = z4;
        }
        if (this.f448throws == null && this.isVip == -1 && !(c4870l.crashlytics == this.appmetrica && m119l() == this.inmobi)) {
            c13645l.adcel();
            i = 1;
            c4870l.amazon = true;
        } else {
            i = 1;
        }
        if (license() > 0 && ((c5278l = this.f448throws) == null || c5278l.f11379l < i)) {
            if (c4870l.amazon) {
                for (int i10 = 0; i10 < i4; i10++) {
                    c13052lArr[i10].crashlytics();
                    int i11 = c4870l.loadAd;
                    if (i11 != Integer.MIN_VALUE) {
                        C13052l c13052l2 = c13052lArr[i10];
                        c13052l2.yandex = i11;
                        c13052l2.loadAd = i11;
                    }
                }
            } else if (z7 || c4870l.billing == null) {
                for (int i12 = 0; i12 < i4; i12++) {
                    C13052l c13052l3 = c13052lArr[i12];
                    boolean z10 = this.ad;
                    int i13 = c4870l.loadAd;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) c13052l3.billing;
                    int iMopub3 = z10 ? c13052l3.mopub(RecyclerView.UNDEFINED_DURATION) : c13052l3.isPro(RecyclerView.UNDEFINED_DURATION);
                    c13052l3.crashlytics();
                    if (iMopub3 != Integer.MIN_VALUE && ((!z10 || iMopub3 >= staggeredGridLayoutManager2.ads.mopub()) && (z10 || iMopub3 <= staggeredGridLayoutManager2.ads.firebase()))) {
                        if (i13 != Integer.MIN_VALUE) {
                            iMopub3 += i13;
                        }
                        c13052l3.loadAd = iMopub3;
                        c13052l3.yandex = iMopub3;
                    }
                }
                int length = c13052lArr.length;
                int[] iArr = c4870l.billing;
                if (iArr == null || iArr.length < length) {
                    c4870l.billing = new int[staggeredGridLayoutManager.adcel.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    c4870l.billing[i14] = c13052lArr[i14].isPro(RecyclerView.UNDEFINED_DURATION);
                }
            } else {
                for (int i15 = 0; i15 < i4; i15++) {
                    C13052l c13052l4 = c13052lArr[i15];
                    c13052l4.crashlytics();
                    int i16 = c4870l.billing[i15];
                    c13052l4.yandex = i16;
                    c13052l4.loadAd = i16;
                }
            }
        }
        startapp(firebaseVar);
        C18339l c18339l = this.license;
        c18339l.yandex = false;
        AbstractC0962l abstractC0962l4 = this.subscription;
        int iSmaato = abstractC0962l4.smaato();
        this.Signature = iSmaato / i4;
        View.MeasureSpec.makeMeasureSpec(iSmaato, abstractC0962l4.subs());
        m112l(c4870l.yandex, c5932l);
        if (c4870l.crashlytics) {
            m110l(-1);
            m105l(firebaseVar, c18339l, c5932l);
            m110l(1);
            c18339l.crashlytics = c4870l.yandex + c18339l.amazon;
            m105l(firebaseVar, c18339l, c5932l);
        } else {
            m110l(1);
            m105l(firebaseVar, c18339l, c5932l);
            m110l(-1);
            c18339l.crashlytics = c4870l.yandex + c18339l.amazon;
            m105l(firebaseVar, c18339l, c5932l);
        }
        if (abstractC0962l4.subs() != 1073741824) {
            int iLicense3 = license();
            float fMax = 0.0f;
            for (int i17 = 0; i17 < iLicense3; i17++) {
                View viewSignature = Signature(i17);
                float fCrashlytics = abstractC0962l4.crashlytics(viewSignature);
                if (fCrashlytics >= fMax) {
                    ((C14791l) viewSignature.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fCrashlytics);
                }
            }
            int i18 = this.Signature;
            int iRound = Math.round(fMax * i4);
            if (abstractC0962l4.subs() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, abstractC0962l4.smaato());
            }
            this.Signature = iRound / i4;
            View.MeasureSpec.makeMeasureSpec(iRound, abstractC0962l4.subs());
            if (this.Signature != i18) {
                for (int i19 = 0; i19 < iLicense3; i19++) {
                    View viewSignature2 = Signature(i19);
                    C14791l c14791l = (C14791l) viewSignature2.getLayoutParams();
                    c14791l.getClass();
                    boolean zM119l = m119l();
                    int i20 = this.tapsense;
                    if (zM119l && i20 == 1) {
                        int i21 = -((i4 - 1) - c14791l.purchase.amazon);
                        viewSignature2.offsetLeftAndRight((this.Signature * i21) - (i21 * i18));
                    } else {
                        int i22 = c14791l.purchase.amazon;
                        int i23 = this.Signature * i22;
                        int i24 = i22 * i18;
                        if (i20 == 1) {
                            viewSignature2.offsetLeftAndRight(i23 - i24);
                        } else {
                            viewSignature2.offsetTopAndBottom(i23 - i24);
                        }
                    }
                }
            }
        }
        if (license() <= 0) {
            z2 = true;
        } else if (this.ad) {
            z2 = true;
            m101l(firebaseVar, c5932l, true);
            m107l(firebaseVar, c5932l, false);
        } else {
            z2 = true;
            m107l(firebaseVar, c5932l, true);
            m101l(firebaseVar, c5932l, false);
        }
        if (!z || c5932l.mopub || this.applovin == 0 || license() <= 0 || m103l() == null) {
            z3 = false;
        } else {
            RecyclerView recyclerView = this.loadAd;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f444native);
            }
            if (m111l()) {
                z3 = z2;
            } else {
                z3 = false;
            }
        }
        if (c5932l.mopub) {
            c4870l.yandex();
        }
        this.appmetrica = c4870l.crashlytics;
        this.inmobi = m119l();
        if (z3) {
            c4870l.yandex();
            m104l(firebaseVar, c5932l, false);
        }
    }

    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public final int m105l(firebase firebaseVar, C18339l c18339l, C5932l c5932l) {
        int i;
        C13052l[] c13052lArr;
        int iM108l;
        BitSet bitSet;
        C13052l[] c13052lArr2;
        C13052l c13052l;
        ?? r5;
        int iIsPro;
        int iCrashlytics;
        int iCrashlytics2;
        int iMopub;
        BitSet bitSet2;
        int i2;
        int i3;
        firebase firebaseVar2 = firebaseVar;
        BitSet bitSet3 = this.advert;
        int i4 = this.startapp;
        bitSet3.set(0, i4, true);
        C18339l c18339l2 = this.license;
        if (c18339l2.subs) {
            i = c18339l.purchase == 1 ? Alert.DURATION_SHOW_INDEFINITELY : RecyclerView.UNDEFINED_DURATION;
        } else {
            i = c18339l.purchase == 1 ? c18339l.mopub + c18339l.loadAd : c18339l.billing - c18339l.loadAd;
        }
        int i5 = c18339l.purchase;
        int i6 = 0;
        while (true) {
            c13052lArr = this.adcel;
            if (i6 >= i4) {
                break;
            }
            if (!((ArrayList) c13052lArr[i6].purchase).isEmpty()) {
                m97l(c13052lArr[i6], i5, i);
            }
            i6++;
        }
        boolean z = this.ad;
        AbstractC0962l abstractC0962l = this.ads;
        int iMopub2 = z ? abstractC0962l.mopub() : abstractC0962l.firebase();
        boolean z2 = false;
        while (true) {
            int i7 = c18339l.crashlytics;
            if (i7 < 0 || i7 >= c5932l.loadAd() || (!c18339l2.subs && bitSet3.isEmpty())) {
                break;
            }
            View view = firebaseVar2.smaato(c18339l.crashlytics, Long.MAX_VALUE).yandex;
            c18339l.crashlytics += c18339l.amazon;
            C14791l c14791l = (C14791l) view.getLayoutParams();
            int iAmazon = c14791l.yandex.amazon();
            C13645l c13645l = this.premium;
            int[] iArr = (int[]) c13645l.f26671l;
            int i8 = (iArr == null || iAmazon >= iArr.length) ? -1 : iArr[iAmazon];
            if (i8 == -1) {
                if (m118l(c18339l.purchase)) {
                    i3 = i4 - 1;
                    i4 = -1;
                    i2 = -1;
                } else {
                    i2 = 1;
                    i3 = 0;
                }
                C13052l c13052l2 = null;
                int i9 = i2;
                if (c18339l.purchase == 1) {
                    int iFirebase = abstractC0962l.firebase();
                    c13052lArr2 = c13052lArr;
                    int i10 = i3;
                    int i11 = Alert.DURATION_SHOW_INDEFINITELY;
                    while (i10 != i4) {
                        int i12 = i10;
                        C13052l c13052l3 = c13052lArr2[i12];
                        BitSet bitSet4 = bitSet3;
                        int iMopub3 = c13052l3.mopub(iFirebase);
                        if (iMopub3 < i11) {
                            i11 = iMopub3;
                            c13052l2 = c13052l3;
                        }
                        i10 = i12 + i9;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    c13052lArr2 = c13052lArr;
                    int iMopub4 = abstractC0962l.mopub();
                    int i13 = i3;
                    int i14 = RecyclerView.UNDEFINED_DURATION;
                    while (i13 != i4) {
                        C13052l c13052l4 = c13052lArr2[i13];
                        int i15 = i4;
                        int iIsPro2 = c13052l4.isPro(iMopub4);
                        if (iIsPro2 > i14) {
                            i14 = iIsPro2;
                            c13052l2 = c13052l4;
                        }
                        i13 += i9;
                        i4 = i15;
                    }
                }
                c13052l = c13052l2;
                c13645l.tapsense(iAmazon);
                ((int[]) c13645l.f26671l)[iAmazon] = c13052l.amazon;
            } else {
                bitSet = bitSet3;
                i4 = i4;
                c13052lArr2 = c13052lArr;
                c13052l = c13052lArr2[i8];
            }
            c14791l.purchase = c13052l;
            if (c18339l.purchase == 1) {
                r5 = 0;
                loadAd(view, -1, false);
            } else {
                r5 = 0;
                loadAd(view, 0, false);
            }
            int i16 = this.tapsense;
            if (i16 == 1) {
                m117l(view, isPro.pro(r5, this.Signature, this.smaato, r5, ((ViewGroup.MarginLayoutParams) c14791l).width), isPro.pro(true, this.metrica, this.remoteconfig, m143package() + m148volatile(), ((ViewGroup.MarginLayoutParams) c14791l).height));
            } else {
                m117l(view, isPro.pro(true, this.vip, this.smaato, m145strictfp() + m146synchronized(), ((ViewGroup.MarginLayoutParams) c14791l).width), isPro.pro(false, this.Signature, this.remoteconfig, 0, ((ViewGroup.MarginLayoutParams) c14791l).height));
            }
            if (c18339l.purchase == 1) {
                iCrashlytics = c13052l.mopub(iMopub2);
                iIsPro = abstractC0962l.crashlytics(view) + iCrashlytics;
            } else {
                iIsPro = c13052l.isPro(iMopub2);
                iCrashlytics = iIsPro - abstractC0962l.crashlytics(view);
            }
            int i17 = c18339l.purchase;
            C13052l c13052l5 = c14791l.purchase;
            if (i17 == 1) {
                c13052l5.getClass();
                C14791l c14791l2 = (C14791l) view.getLayoutParams();
                c14791l2.purchase = c13052l5;
                ArrayList arrayList = (ArrayList) c13052l5.purchase;
                arrayList.add(view);
                c13052l5.loadAd = RecyclerView.UNDEFINED_DURATION;
                if (arrayList.size() == 1) {
                    c13052l5.yandex = RecyclerView.UNDEFINED_DURATION;
                }
                if (c14791l2.yandex.isPro() || c14791l2.yandex.remoteconfig()) {
                    c13052l5.crashlytics = ((StaggeredGridLayoutManager) c13052l5.billing).ads.crashlytics(view) + c13052l5.crashlytics;
                }
            } else {
                c13052l5.getClass();
                C14791l c14791l3 = (C14791l) view.getLayoutParams();
                c14791l3.purchase = c13052l5;
                ArrayList arrayList2 = (ArrayList) c13052l5.purchase;
                arrayList2.add(0, view);
                c13052l5.yandex = RecyclerView.UNDEFINED_DURATION;
                if (arrayList2.size() == 1) {
                    c13052l5.loadAd = RecyclerView.UNDEFINED_DURATION;
                }
                if (c14791l3.yandex.isPro() || c14791l3.yandex.remoteconfig()) {
                    c13052l5.crashlytics = ((StaggeredGridLayoutManager) c13052l5.billing).ads.crashlytics(view) + c13052l5.crashlytics;
                }
            }
            boolean zM119l = m119l();
            AbstractC0962l abstractC0962l2 = this.subscription;
            if (zM119l && i16 == 1) {
                iMopub = abstractC0962l2.mopub() - (((i4 - 1) - c13052l.amazon) * this.Signature);
                iCrashlytics2 = iMopub - abstractC0962l2.crashlytics(view);
            } else {
                int iFirebase2 = (c13052l.amazon * this.Signature) + abstractC0962l2.firebase();
                int iCrashlytics3 = abstractC0962l2.crashlytics(view) + iFirebase2;
                iCrashlytics2 = iFirebase2;
                iMopub = iCrashlytics3;
            }
            z2 = true;
            if (i16 == 1) {
                isPro.m124case(view, iCrashlytics2, iCrashlytics, iMopub, iIsPro);
            } else {
                isPro.m124case(view, iCrashlytics, iCrashlytics2, iIsPro, iMopub);
            }
            m97l(c13052l, c18339l2.purchase, i);
            firebaseVar2 = firebaseVar;
            m121l(firebaseVar2, c18339l2);
            if (c18339l2.admob && view.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(c13052l.amazon, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i4 = i4;
            c13052lArr = c13052lArr2;
        }
        if (!z2) {
            m121l(firebaseVar2, c18339l2);
        }
        if (c18339l2.purchase == -1) {
            iM108l = abstractC0962l.firebase() - m102l(abstractC0962l.firebase());
        } else {
            iM108l = m108l(abstractC0962l.mopub()) - abstractC0962l.mopub();
        }
        if (iM108l > 0) {
            return Math.min(c18339l.loadAd, iM108l);
        }
        return 0;
    }

    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    public final View m106l(boolean z) {
        AbstractC0962l abstractC0962l = this.ads;
        int iFirebase = abstractC0962l.firebase();
        int iMopub = abstractC0962l.mopub();
        View view = null;
        for (int iLicense = license() - 1; iLicense >= 0; iLicense--) {
            View viewSignature = Signature(iLicense);
            int iPurchase = abstractC0962l.purchase(viewSignature);
            int iLoadAd = abstractC0962l.loadAd(viewSignature);
            if (iLoadAd > iFirebase && iPurchase < iMopub) {
                if (iLoadAd <= iMopub || !z) {
                    return viewSignature;
                }
                if (view == null) {
                    view = viewSignature;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: lٍؚۖ, reason: contains not printable characters */
    public final void m107l(firebase firebaseVar, C5932l c5932l, boolean z) {
        int iFirebase;
        int iM102l = m102l(Alert.DURATION_SHOW_INDEFINITELY);
        if (iM102l != Integer.MAX_VALUE && (iFirebase = iM102l - this.ads.firebase()) > 0) {
            int iM116l = iFirebase - m116l(iFirebase, c5932l, firebaseVar);
            if (!z || iM116l <= 0) {
                return;
            }
            this.ads.metrica(-iM116l);
        }
    }

    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public final int m108l(int i) {
        int iMopub = this.adcel[0].mopub(i);
        for (int i2 = 1; i2 < this.startapp; i2++) {
            int iMopub2 = this.adcel[i2].mopub(i);
            if (iMopub2 > iMopub) {
                iMopub = iMopub2;
            }
        }
        return iMopub;
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public final void m109l(int i, C5932l c5932l) {
        int iM98l;
        int i2;
        if (i > 0) {
            iM98l = m114l();
            i2 = 1;
        } else {
            iM98l = m98l();
            i2 = -1;
        }
        C18339l c18339l = this.license;
        c18339l.yandex = true;
        m112l(iM98l, c5932l);
        m110l(i2);
        c18339l.crashlytics = iM98l + c18339l.amazon;
        c18339l.loadAd = Math.abs(i);
    }

    /* JADX INFO: renamed from: lٍۤٙ, reason: contains not printable characters */
    public final void m110l(int i) {
        C18339l c18339l = this.license;
        c18339l.purchase = i;
        c18339l.amazon = this.ad != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lؚْٟ */
    public final void mo79l(RecyclerView recyclerView, int i) {
        purchase purchaseVar = new purchase(recyclerView.getContext());
        purchaseVar.yandex = i;
        m137l(purchaseVar);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lْ٘ۚ */
    public final void mo46l(Rect rect, int i, int i2) {
        int iMopub;
        int iMopub2;
        int iM145strictfp = m145strictfp() + m146synchronized();
        int iM143package = m143package() + m148volatile();
        int i3 = this.tapsense;
        int i4 = this.startapp;
        if (i3 == 1) {
            int iHeight = rect.height() + iM143package;
            RecyclerView recyclerView = this.loadAd;
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            iMopub2 = isPro.mopub(i2, iHeight, recyclerView.getMinimumHeight());
            iMopub = isPro.mopub(i, (this.Signature * i4) + iM145strictfp, this.loadAd.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM145strictfp;
            RecyclerView recyclerView2 = this.loadAd;
            WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
            iMopub = isPro.mopub(i, iWidth, recyclerView2.getMinimumWidth());
            iMopub2 = isPro.mopub(i2, (this.Signature * i4) + iM143package, this.loadAd.getMinimumHeight());
        }
        this.loadAd.setMeasuredDimension(iMopub, iMopub2);
    }

    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public final boolean m111l() {
        int iM98l;
        if (license() != 0 && this.applovin != 0 && this.mopub) {
            if (this.ad) {
                iM98l = m114l();
                m98l();
            } else {
                iM98l = m98l();
                m114l();
            }
            if (iM98l == 0 && m103l() != null) {
                this.premium.adcel();
                this.billing = true;
                m141l();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: lؘْٔ, reason: contains not printable characters */
    public final void m112l(int i, C5932l c5932l) {
        int iSmaato;
        int iSmaato2;
        int i2;
        C18339l c18339l = this.license;
        boolean z = false;
        c18339l.loadAd = 0;
        c18339l.crashlytics = i;
        purchase purchaseVar = this.purchase;
        AbstractC0962l abstractC0962l = this.ads;
        if (purchaseVar == null || !purchaseVar.purchase || (i2 = c5932l.yandex) == -1) {
            iSmaato = 0;
            iSmaato2 = 0;
        } else {
            if (this.ad == (i2 < i)) {
                iSmaato = abstractC0962l.smaato();
                iSmaato2 = 0;
            } else {
                iSmaato2 = abstractC0962l.smaato();
                iSmaato = 0;
            }
        }
        RecyclerView recyclerView = this.loadAd;
        if (recyclerView == null || !recyclerView.mClipToPadding) {
            c18339l.mopub = abstractC0962l.billing() + iSmaato;
            c18339l.billing = -iSmaato2;
        } else {
            c18339l.billing = abstractC0962l.firebase() - iSmaato2;
            c18339l.mopub = abstractC0962l.mopub() + iSmaato;
        }
        c18339l.admob = false;
        c18339l.yandex = true;
        if (abstractC0962l.subs() == 0 && abstractC0962l.billing() == 0) {
            z = true;
        }
        c18339l.subs = z;
    }

    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    public final int m113l(C5932l c5932l) {
        if (license() == 0) {
            return 0;
        }
        boolean z = !this.f446strictfp;
        return AbstractC11994l.crashlytics(c5932l, this.ads, m99l(z), m106l(z), this, this.f446strictfp, this.ad);
    }

    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
    public final int m114l() {
        int iLicense = license();
        if (iLicense == 0) {
            return 0;
        }
        return isPro.m126native(Signature(iLicense - 1));
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: lَٖؔ */
    public final int mo51l(int i, C5932l c5932l, firebase firebaseVar) {
        return m116l(i, c5932l, firebaseVar);
    }

    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public final void m115l() {
        if (this.tapsense == 1 || !m119l()) {
            this.ad = this.pro;
        } else {
            this.ad = !this.pro;
        }
    }

    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
    public final int m116l(int i, C5932l c5932l, firebase firebaseVar) {
        if (license() == 0 || i == 0) {
            return 0;
        }
        m109l(i, c5932l);
        C18339l c18339l = this.license;
        int iM105l = m105l(firebaseVar, c18339l, c5932l);
        if (c18339l.loadAd >= iM105l) {
            i = i < 0 ? -iM105l : iM105l;
        }
        this.ads.metrica(-i);
        this.appmetrica = this.ad;
        c18339l.loadAd = 0;
        m121l(firebaseVar, c18339l);
        return i;
    }

    /* JADX INFO: renamed from: lٖۥۡ, reason: contains not printable characters */
    public final void m117l(View view, int i, int i2) {
        RecyclerView recyclerView = this.loadAd;
        Rect rect = this.f445package;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
        C14791l c14791l = (C14791l) view.getLayoutParams();
        int iM93l = m93l(i, ((ViewGroup.MarginLayoutParams) c14791l).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c14791l).rightMargin + rect.right);
        int iM93l2 = m93l(i2, ((ViewGroup.MarginLayoutParams) c14791l).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c14791l).bottomMargin + rect.bottom);
        if (m139l(view, iM93l, iM93l2, c14791l)) {
            view.measure(iM93l, iM93l2);
        }
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final boolean m118l(int i) {
        if (this.tapsense == 0) {
            return (i == -1) != this.ad;
        }
        return ((i == -1) == this.ad) == m119l();
    }

    /* JADX INFO: renamed from: lْٗٔ, reason: contains not printable characters */
    public final boolean m119l() {
        return this.loadAd.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public final void m120l(firebase firebaseVar, int i) {
        while (license() > 0) {
            View viewSignature = Signature(0);
            AbstractC0962l abstractC0962l = this.ads;
            if (abstractC0962l.loadAd(viewSignature) > i || abstractC0962l.remoteconfig(viewSignature) > i) {
                return;
            }
            C14791l c14791l = (C14791l) viewSignature.getLayoutParams();
            c14791l.getClass();
            if (((ArrayList) c14791l.purchase.purchase).size() == 1) {
                return;
            }
            C13052l c13052l = c14791l.purchase;
            ArrayList arrayList = (ArrayList) c13052l.purchase;
            View view = (View) arrayList.remove(0);
            C14791l c14791l2 = (C14791l) view.getLayoutParams();
            c14791l2.purchase = null;
            if (arrayList.size() == 0) {
                c13052l.loadAd = RecyclerView.UNDEFINED_DURATION;
            }
            if (c14791l2.yandex.isPro() || c14791l2.yandex.remoteconfig()) {
                c13052l.crashlytics -= ((StaggeredGridLayoutManager) c13052l.billing).ads.crashlytics(view);
            }
            c13052l.yandex = RecyclerView.UNDEFINED_DURATION;
            m144return(viewSignature, firebaseVar);
        }
    }

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final void m121l(firebase firebaseVar, C18339l c18339l) {
        if (!c18339l.yandex || c18339l.subs) {
            return;
        }
        int i = c18339l.loadAd;
        int i2 = c18339l.purchase;
        if (i == 0) {
            if (i2 == -1) {
                m96l(firebaseVar, c18339l.mopub);
                return;
            } else {
                m120l(firebaseVar, c18339l.billing);
                return;
            }
        }
        int i3 = this.startapp;
        C13052l[] c13052lArr = this.adcel;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = c18339l.billing;
            int iIsPro = c13052lArr[0].isPro(i5);
            while (i4 < i3) {
                int iIsPro2 = c13052lArr[i4].isPro(i5);
                if (iIsPro2 > iIsPro) {
                    iIsPro = iIsPro2;
                }
                i4++;
            }
            int i6 = i5 - iIsPro;
            int iMin = c18339l.mopub;
            if (i6 >= 0) {
                iMin -= Math.min(i6, c18339l.loadAd);
            }
            m96l(firebaseVar, iMin);
            return;
        }
        int i7 = c18339l.mopub;
        int iMopub = c13052lArr[0].mopub(i7);
        while (i4 < i3) {
            int iMopub2 = c13052lArr[i4].mopub(i7);
            if (iMopub2 < iMopub) {
                iMopub = iMopub2;
            }
            i4++;
        }
        int i8 = iMopub - c18339l.mopub;
        int iMin2 = c18339l.billing;
        if (i8 >= 0) {
            iMin2 += Math.min(i8, c18339l.loadAd);
        }
        m120l(firebaseVar, iMin2);
    }

    @Override // androidx.recyclerview.widget.isPro
    public final int metrica(C5932l c5932l) {
        if (license() == 0) {
            return 0;
        }
        boolean z = !this.f446strictfp;
        return AbstractC11994l.amazon(c5932l, this.ads, m99l(z), m106l(z), this, this.f446strictfp);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: new */
    public final void mo53new(firebase firebaseVar, C5932l c5932l, C15685l c15685l) {
        super.mo53new(firebaseVar, c5932l, c15685l);
        c15685l.isPro("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final void mo122protected(int i) {
        if (i == 0) {
            m111l();
        }
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: public */
    public final void mo54public(int i, int i2) {
        m100l(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.isPro
    public final boolean purchase() {
        return this.tapsense == 1;
    }

    @Override // androidx.recyclerview.widget.isPro
    public final int remoteconfig(C5932l c5932l) {
        if (license() == 0) {
            return 0;
        }
        boolean z = !this.f446strictfp;
        return AbstractC11994l.loadAd(c5932l, this.ads, m99l(z), m106l(z), this, this.f446strictfp);
    }

    @Override // androidx.recyclerview.widget.isPro
    public final int smaato(C5932l c5932l) {
        if (license() == 0) {
            return 0;
        }
        boolean z = !this.f446strictfp;
        return AbstractC11994l.amazon(c5932l, this.ads, m99l(z), m106l(z), this, this.f446strictfp);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: static */
    public final void mo90static(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.loadAd;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f444native);
        }
        for (int i = 0; i < this.startapp; i++) {
            this.adcel[i].crashlytics();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.isPro
    public final C13036l subscription(Context context, AttributeSet attributeSet) {
        return new C14791l(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: super */
    public final void mo55super(firebase firebaseVar, C5932l c5932l, View view, C15685l c15685l) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C14791l)) {
            m130goto(view, c15685l);
            return;
        }
        C13052l c13052l = ((C14791l) layoutParams).purchase;
        if (this.tapsense == 0) {
            c15685l.firebase(C10975l.m3010package(false, c13052l == null ? -1 : c13052l.amazon, 1, -1, -1));
        } else {
            c15685l.firebase(C10975l.m3010package(false, -1, -1, c13052l == null ? -1 : c13052l.amazon, 1));
        }
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void mo123switch(int i) {
        super.mo123switch(i);
        for (int i2 = 0; i2 < this.startapp; i2++) {
            C13052l c13052l = this.adcel[i2];
            int i3 = c13052l.yandex;
            if (i3 != Integer.MIN_VALUE) {
                c13052l.yandex = i3 + i;
            }
            int i4 = c13052l.loadAd;
            if (i4 != Integer.MIN_VALUE) {
                c13052l.loadAd = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.isPro
    public final C13036l tapsense(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C14791l((ViewGroup.MarginLayoutParams) layoutParams) : new C14791l(layoutParams);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: this */
    public final void mo56this(firebase firebaseVar, C5932l c5932l) {
        m104l(firebaseVar, c5932l, true);
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: throw */
    public final boolean mo91throw() {
        return this.applovin != 0;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: transient */
    public final Parcelable mo92transient() {
        int iIsPro;
        int iFirebase;
        int[] iArr;
        C5278l c5278l = this.f448throws;
        if (c5278l != null) {
            C5278l c5278l2 = new C5278l();
            c5278l2.f11379l = c5278l.f11379l;
            c5278l2.f11383l = c5278l.f11383l;
            c5278l2.f11382l = c5278l.f11382l;
            c5278l2.f11386l = c5278l.f11386l;
            c5278l2.f11385l = c5278l.f11385l;
            c5278l2.f11388l = c5278l.f11388l;
            c5278l2.f11381l = c5278l.f11381l;
            c5278l2.f11387l = c5278l.f11387l;
            c5278l2.f11384l = c5278l.f11384l;
            c5278l2.f11380l = c5278l.f11380l;
            return c5278l2;
        }
        C5278l c5278l3 = new C5278l();
        c5278l3.f11381l = this.pro;
        c5278l3.f11387l = this.appmetrica;
        c5278l3.f11384l = this.inmobi;
        C13645l c13645l = this.premium;
        if (c13645l == null || (iArr = (int[]) c13645l.f26671l) == null) {
            c5278l3.f11385l = 0;
        } else {
            c5278l3.f11388l = iArr;
            c5278l3.f11385l = iArr.length;
            c5278l3.f11380l = (ArrayList) c13645l.f26670l;
        }
        if (license() <= 0) {
            c5278l3.f11383l = -1;
            c5278l3.f11382l = -1;
            c5278l3.f11379l = 0;
            return c5278l3;
        }
        c5278l3.f11383l = this.appmetrica ? m114l() : m98l();
        View viewM106l = this.ad ? m106l(true) : m99l(true);
        c5278l3.f11382l = viewM106l != null ? isPro.m126native(viewM106l) : -1;
        int i = this.startapp;
        c5278l3.f11379l = i;
        c5278l3.f11386l = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.appmetrica;
            AbstractC0962l abstractC0962l = this.ads;
            C13052l[] c13052lArr = this.adcel;
            if (z) {
                iIsPro = c13052lArr[i2].mopub(RecyclerView.UNDEFINED_DURATION);
                if (iIsPro != Integer.MIN_VALUE) {
                    iFirebase = abstractC0962l.mopub();
                    iIsPro -= iFirebase;
                }
            } else {
                iIsPro = c13052lArr[i2].isPro(RecyclerView.UNDEFINED_DURATION);
                if (iIsPro != Integer.MIN_VALUE) {
                    iFirebase = abstractC0962l.firebase();
                    iIsPro -= iFirebase;
                }
            }
            c5278l3.f11386l[i2] = iIsPro;
        }
        return c5278l3;
    }

    @Override // androidx.recyclerview.widget.isPro
    /* JADX INFO: renamed from: try */
    public final void mo57try(C5932l c5932l) {
        this.isVip = -1;
        this.signatures = RecyclerView.UNDEFINED_DURATION;
        this.f448throws = null;
        this.f447synchronized.yandex();
    }

    @Override // androidx.recyclerview.widget.isPro
    public final int vip(C5932l c5932l) {
        return m113l(c5932l);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // defpackage.InterfaceC9662l
    public final PointF yandex(int i) {
        int i2 = -1;
        if (license() != 0) {
            if ((i < m98l()) == this.ad) {
                i2 = 1;
            }
        } else if (this.ad) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.tapsense == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }
}
