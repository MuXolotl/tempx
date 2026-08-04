package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lّؒۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1299l implements Cloneable {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public InterfaceC4788l[] f3355l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public long f3362l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public ArrayList f3371l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public ArrayList f3374l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public long f3377l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final Animator[] f3352l = new Animator[0];

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public static final int[] f3353l = {2, 1, 3, 4};

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public static final C6565l f3350l = new C6565l(12);

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public static final ThreadLocal f3351l = new ThreadLocal();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f3364l = getClass().getName();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f3363l = -1;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f3356l = -1;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public TimeInterpolator f3370l = null;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final ArrayList f3369l = new ArrayList();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final ArrayList f3373l = new ArrayList();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C12014l f3357l = new C12014l(27);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C12014l f3360l = new C12014l(27);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C0132l f3372l = null;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int[] f3367l = f3353l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final ArrayList f3375l = new ArrayList();

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public Animator[] f3368l = f3352l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f3361l = 0;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f3366l = false;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f3376l = false;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public AbstractC1299l f3365l = null;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public ArrayList f3359l = null;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public ArrayList f3358l = new ArrayList();

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public C6565l f3354l = f3350l;

    public static C11154l adcel() {
        ThreadLocal threadLocal = f3351l;
        C11154l c11154l = (C11154l) threadLocal.get();
        if (c11154l != null) {
            return c11154l;
        }
        C11154l c11154l2 = new C11154l(0);
        threadLocal.set(c11154l2);
        return c11154l2;
    }

    public static void loadAd(C12014l c12014l, View view, C18285l c18285l) {
        C11154l c11154l = (C11154l) c12014l.f23941l;
        C11154l c11154l2 = (C11154l) c12014l.f23943l;
        SparseArray sparseArray = (SparseArray) c12014l.f23940l;
        C3994l c3994l = (C3994l) c12014l.f23944l;
        c11154l.put(view, c18285l);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (c11154l2.containsKey(transitionName)) {
                c11154l2.put(transitionName, null);
            } else {
                c11154l2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c3994l.billing(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c3994l.subs(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c3994l.amazon(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c3994l.subs(itemIdAtPosition, null);
                }
            }
        }
    }

    public static boolean pro(C18285l c18285l, C18285l c18285l2, String str) {
        Object obj = c18285l.yandex.get(str);
        Object obj2 = c18285l2.yandex.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public boolean Signature(C18285l c18285l, C18285l c18285l2) {
        if (c18285l != null && c18285l2 != null) {
            String[] strArrAds = ads();
            if (strArrAds != null) {
                for (String str : strArrAds) {
                    if (pro(c18285l, c18285l2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c18285l.yandex.keySet().iterator();
                while (it.hasNext()) {
                    if (pro(c18285l, c18285l2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void ad(AbstractC1299l abstractC1299l, C1759l c1759l, boolean z) {
        AbstractC1299l abstractC1299l2 = this.f3365l;
        if (abstractC1299l2 != null) {
            abstractC1299l2.ad(abstractC1299l, c1759l, z);
        }
        ArrayList arrayList = this.f3359l;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f3359l.size();
        InterfaceC4788l[] interfaceC4788lArr = this.f3355l;
        if (interfaceC4788lArr == null) {
            interfaceC4788lArr = new InterfaceC4788l[size];
        }
        this.f3355l = null;
        InterfaceC4788l[] interfaceC4788lArr2 = (InterfaceC4788l[]) this.f3359l.toArray(interfaceC4788lArr);
        for (int i = 0; i < size; i++) {
            InterfaceC4788l interfaceC4788l = interfaceC4788lArr2[i];
            switch (c1759l.f4173l) {
                case 13:
                    interfaceC4788l.amazon(abstractC1299l);
                    break;
                case 14:
                    interfaceC4788l.purchase(abstractC1299l);
                    break;
                case 15:
                    interfaceC4788l.mopub(abstractC1299l);
                    break;
                case 16:
                    interfaceC4788l.loadAd();
                    break;
                default:
                    interfaceC4788l.billing();
                    break;
            }
            interfaceC4788lArr2[i] = null;
        }
        this.f3355l = interfaceC4788lArr2;
    }

    public abstract void admob(C18285l c18285l);

    public String[] ads() {
        return null;
    }

    public void advert(View view) {
        if (this.f3376l) {
            return;
        }
        ArrayList arrayList = this.f3375l;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3368l);
        this.f3368l = f3352l;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f3368l = animatorArr;
        ad(this, C1759l.f4170l, false);
        this.f3366l = true;
    }

    public abstract void amazon(C18285l c18285l);

    public void applovin() {
        m865native();
        C11154l c11154lAdcel = adcel();
        for (Animator animator : this.f3358l) {
            if (c11154lAdcel.containsKey(animator)) {
                m865native();
                if (animator != null) {
                    animator.addListener(new C0696l(this, c11154lAdcel));
                    long j = this.f3356l;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f3363l;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f3370l;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C7538l(7, this));
                    animator.start();
                }
            }
        }
        this.f3358l.clear();
        vip();
    }

    public void appmetrica(long j, long j2) {
        long j3 = this.f3377l;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.f3376l = false;
            ad(this, C1759l.f4169l, z);
        }
        ArrayList arrayList = this.f3375l;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3368l);
        this.f3368l = f3352l;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            AbstractC0986l.loadAd(animator, Math.min(Math.max(0L, j), AbstractC0986l.yandex(animator)));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.f3368l = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.f3376l = true;
        }
        ad(this, C1759l.f4168l, z);
    }

    public void crashlytics() {
        ArrayList arrayList = this.f3375l;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3368l);
        this.f3368l = f3352l;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f3368l = animatorArr;
        ad(this, C1759l.f4171l, false);
    }

    @Override // 
    /* JADX INFO: renamed from: firebase, reason: merged with bridge method [inline-methods] */
    public AbstractC1299l clone() {
        try {
            AbstractC1299l abstractC1299l = (AbstractC1299l) super.clone();
            abstractC1299l.f3358l = new ArrayList();
            abstractC1299l.f3357l = new C12014l(27);
            abstractC1299l.f3360l = new C12014l(27);
            abstractC1299l.f3374l = null;
            abstractC1299l.f3371l = null;
            abstractC1299l.f3365l = this;
            abstractC1299l.f3359l = null;
            return abstractC1299l;
        } catch (CloneNotSupportedException e) {
            C11467l.metrica(e);
            return null;
        }
    }

    public void inmobi(long j) {
        this.f3356l = j;
    }

    public final void isPro(boolean z) {
        if (z) {
            ((C11154l) this.f3357l.f23941l).clear();
            ((SparseArray) this.f3357l.f23940l).clear();
            ((C3994l) this.f3357l.f23944l).loadAd();
        } else {
            ((C11154l) this.f3360l.f23941l).clear();
            ((SparseArray) this.f3360l.f23940l).clear();
            ((C3994l) this.f3360l.f23944l).loadAd();
        }
    }

    public void isVip() {
        C11154l c11154lAdcel = adcel();
        this.f3377l = 0L;
        int i = 0;
        while (true) {
            int size = this.f3358l.size();
            ArrayList arrayList = this.f3358l;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = (Animator) arrayList.get(i);
            C10087l c10087l = (C10087l) c11154lAdcel.get(animator);
            if (animator != null && c10087l != null) {
                Animator animator2 = c10087l.billing;
                long j = this.f3356l;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.f3363l;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.f3370l;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f3375l.add(animator);
                this.f3377l = Math.max(this.f3377l, AbstractC0986l.yandex(animator));
            }
            i++;
        }
    }

    public final boolean license(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f3369l;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3373l;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final C18285l metrica(View view, boolean z) {
        C0132l c0132l = this.f3372l;
        if (c0132l != null) {
            return c0132l.metrica(view, z);
        }
        ArrayList arrayList = z ? this.f3374l : this.f3371l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C18285l c18285l = (C18285l) arrayList.get(i);
            if (c18285l == null) {
                return null;
            }
            if (c18285l.loadAd == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (C18285l) (z ? this.f3371l : this.f3374l).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m865native() {
        if (this.f3361l == 0) {
            ad(this, C1759l.f4169l, false);
            this.f3376l = false;
        }
        this.f3361l++;
    }

    /* JADX INFO: renamed from: package */
    public void mo278package(TimeInterpolator timeInterpolator) {
        this.f3370l = timeInterpolator;
    }

    public void premium(View view) {
        if (this.f3366l) {
            if (!this.f3376l) {
                ArrayList arrayList = this.f3375l;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3368l);
                this.f3368l = f3352l;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f3368l = animatorArr;
                ad(this, C1759l.f4172l, false);
            }
            this.f3366l = false;
        }
    }

    /* JADX INFO: renamed from: private */
    public String mo279private(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f3356l != -1) {
            sb.append("dur(");
            sb.append(this.f3356l);
            sb.append(") ");
        }
        if (this.f3363l != -1) {
            sb.append("dly(");
            sb.append(this.f3363l);
            sb.append(") ");
        }
        if (this.f3370l != null) {
            sb.append("interp(");
            sb.append(this.f3370l);
            sb.append(") ");
        }
        ArrayList arrayList = this.f3369l;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3373l;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public final void purchase(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C18285l c18285l = new C18285l(view);
            if (z) {
                admob(c18285l);
            } else {
                amazon(c18285l);
            }
            c18285l.crashlytics.add(this);
            billing(c18285l);
            if (z) {
                loadAd(this.f3357l, view, c18285l);
            } else {
                loadAd(this.f3360l, view, c18285l);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                purchase(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void remoteconfig(ViewGroup viewGroup, C12014l c12014l, C12014l c12014l2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        C18285l c18285l;
        Animator animator;
        C18285l c18285l2;
        C11154l c11154lAdcel = adcel();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        startapp().getClass();
        int i3 = 0;
        while (i3 < size) {
            C18285l c18285l3 = (C18285l) arrayList.get(i3);
            C18285l c18285l4 = (C18285l) arrayList2.get(i3);
            if (c18285l3 != null && !c18285l3.crashlytics.contains(this)) {
                c18285l3 = null;
            }
            if (c18285l4 != null && !c18285l4.crashlytics.contains(this)) {
                c18285l4 = null;
            }
            if ((c18285l3 != null || c18285l4 != null) && (c18285l3 == null || c18285l4 == null || Signature(c18285l3, c18285l4))) {
                Animator animatorSmaato = smaato(viewGroup, c18285l3, c18285l4);
                if (animatorSmaato != null) {
                    String str = this.f3364l;
                    if (c18285l4 != null) {
                        view = c18285l4.loadAd;
                        String[] strArrAds = ads();
                        if (strArrAds != null && strArrAds.length > 0) {
                            c18285l2 = new C18285l(view);
                            C18285l c18285l5 = (C18285l) ((C11154l) c12014l2.f23941l).get(view);
                            i = size;
                            if (c18285l5 != null) {
                                int i4 = 0;
                                while (i4 < strArrAds.length) {
                                    String str2 = strArrAds[i4];
                                    int i5 = i3;
                                    c18285l2.yandex.put(str2, c18285l5.yandex.get(str2));
                                    i4++;
                                    i3 = i5;
                                    c18285l5 = c18285l5;
                                }
                            }
                            i2 = i3;
                            int i6 = c11154lAdcel.f11161l;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    animator = animatorSmaato;
                                    break;
                                }
                                C10087l c10087l = (C10087l) c11154lAdcel.get((Animator) c11154lAdcel.billing(i7));
                                if (c10087l.crashlytics != null && c10087l.yandex == view && c10087l.loadAd.equals(str) && c10087l.crashlytics.equals(c18285l2)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = animatorSmaato;
                            c18285l2 = null;
                        }
                        animatorSmaato = animator;
                        c18285l = c18285l2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = c18285l3.loadAd;
                        c18285l = null;
                    }
                    if (animatorSmaato != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C10087l c10087l2 = new C10087l();
                        c10087l2.yandex = view;
                        c10087l2.loadAd = str;
                        c10087l2.crashlytics = c18285l;
                        c10087l2.amazon = windowId;
                        c10087l2.purchase = this;
                        c10087l2.billing = animatorSmaato;
                        c11154lAdcel.put(animatorSmaato, c10087l2);
                        this.f3358l.add(animatorSmaato);
                    }
                }
                i3 = i2 + 1;
                size = i;
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                C10087l c10087l3 = (C10087l) c11154lAdcel.get((Animator) this.f3358l.get(sparseIntArray.keyAt(i8)));
                c10087l3.billing.setStartDelay(c10087l3.billing.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE));
            }
        }
    }

    public AbstractC1299l signatures(InterfaceC4788l interfaceC4788l) {
        AbstractC1299l abstractC1299l;
        ArrayList arrayList = this.f3359l;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC4788l) && (abstractC1299l = this.f3365l) != null) {
                abstractC1299l.signatures(interfaceC4788l);
            }
            if (this.f3359l.size() == 0) {
                this.f3359l = null;
            }
        }
        return this;
    }

    public Animator smaato(ViewGroup viewGroup, C18285l c18285l, C18285l c18285l2) {
        return null;
    }

    public final AbstractC1299l startapp() {
        C0132l c0132l = this.f3372l;
        return c0132l != null ? c0132l.startapp() : this;
    }

    public final void subs(ViewGroup viewGroup, boolean z) {
        isPro(z);
        ArrayList arrayList = this.f3369l;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3373l;
        if (size <= 0 && arrayList2.size() <= 0) {
            purchase(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                C18285l c18285l = new C18285l(viewFindViewById);
                if (z) {
                    admob(c18285l);
                } else {
                    amazon(c18285l);
                }
                c18285l.crashlytics.add(this);
                billing(c18285l);
                if (z) {
                    loadAd(this.f3357l, viewFindViewById, c18285l);
                } else {
                    loadAd(this.f3360l, viewFindViewById, c18285l);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C18285l c18285l2 = new C18285l(view);
            if (z) {
                admob(c18285l2);
            } else {
                amazon(c18285l2);
            }
            c18285l2.crashlytics.add(this);
            billing(c18285l2);
            if (z) {
                loadAd(this.f3357l, view, c18285l2);
            } else {
                loadAd(this.f3360l, view, c18285l2);
            }
        }
    }

    public final C18285l subscription(View view, boolean z) {
        C0132l c0132l = this.f3372l;
        if (c0132l != null) {
            return c0132l.subscription(view, z);
        }
        return (C18285l) ((C11154l) (z ? this.f3357l : this.f3360l).f23941l).get(view);
    }

    /* JADX INFO: renamed from: synchronized */
    public void mo281synchronized(C6565l c6565l) {
        if (c6565l == null) {
            this.f3354l = f3350l;
        } else {
            this.f3354l = c6565l;
        }
    }

    public boolean tapsense() {
        return !this.f3375l.isEmpty();
    }

    public final String toString() {
        return mo279private("");
    }

    public final void vip() {
        int i = this.f3361l - 1;
        this.f3361l = i;
        if (i == 0) {
            ad(this, C1759l.f4168l, false);
            for (int i2 = 0; i2 < ((C3994l) this.f3357l.f23944l).firebase(); i2++) {
                View view = (View) ((C3994l) this.f3357l.f23944l).smaato(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C3994l) this.f3360l.f23944l).firebase(); i3++) {
                View view2 = (View) ((C3994l) this.f3360l.f23944l).smaato(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f3376l = true;
        }
    }

    /* JADX INFO: renamed from: volatile */
    public void mo283volatile(long j) {
        this.f3363l = j;
    }

    public void yandex(InterfaceC4788l interfaceC4788l) {
        if (this.f3359l == null) {
            this.f3359l = new ArrayList();
        }
        this.f3359l.add(interfaceC4788l);
    }

    /* JADX INFO: renamed from: strictfp */
    public void mo280strictfp() {
    }

    public void billing(C18285l c18285l) {
    }

    /* JADX INFO: renamed from: throws */
    public void mo282throws(AbstractC6604l abstractC6604l) {
    }
}
