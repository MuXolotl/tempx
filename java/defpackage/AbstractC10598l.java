package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lَ۟ٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10598l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f21509l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f21510l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C12222l f21512l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f21513l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C17535l f21511l = AbstractC4071l.yandex(true);
    private volatile /* synthetic */ Object interceptors$delegate = null;

    public AbstractC10598l(C12222l... c12222lArr) {
        this.f21510l = AbstractC14055l.metrica(Arrays.copyOf(c12222lArr, c12222lArr.length));
    }

    public final boolean admob(C12222l c12222l) {
        ArrayList arrayList = this.f21510l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c12222l) {
                return true;
            }
            if ((obj instanceof C13962l) && ((C13962l) obj).yandex == c12222l) {
                return true;
            }
        }
        return false;
    }

    public final C13962l amazon(C12222l c12222l) {
        ArrayList arrayList = this.f21510l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c12222l) {
                C13962l c13962l = new C13962l(c12222l, C10347l.purchase);
                arrayList.set(i, c13962l);
                return c13962l;
            }
            if (obj instanceof C13962l) {
                C13962l c13962l2 = (C13962l) obj;
                if (c13962l2.yandex == c12222l) {
                    return c13962l2;
                }
            }
        }
        return null;
    }

    public final boolean crashlytics(AbstractC10598l abstractC10598l) {
        ArrayList arrayList = this.f21510l;
        if (abstractC10598l.f21510l.isEmpty()) {
            return true;
        }
        int i = 0;
        if (!arrayList.isEmpty()) {
            return false;
        }
        ArrayList arrayList2 = abstractC10598l.f21510l;
        int iSmaato = AbstractC14055l.smaato(arrayList2);
        if (iSmaato >= 0) {
            while (true) {
                Object obj = arrayList2.get(i);
                if (obj instanceof C12222l) {
                    arrayList.add(obj);
                } else if (obj instanceof C13962l) {
                    C13962l c13962l = (C13962l) obj;
                    C12222l c12222l = c13962l.yandex;
                    AbstractC17653l abstractC17653l = c13962l.loadAd;
                    c13962l.amazon = true;
                    arrayList.add(new C13962l(c12222l, abstractC17653l, c13962l.crashlytics));
                }
                if (i == iSmaato) {
                    break;
                }
                i++;
            }
        }
        this.f21509l += abstractC10598l.f21509l;
        this.interceptors$delegate = abstractC10598l.metrica();
        this.f21513l = true;
        this.f21512l = null;
        return true;
    }

    public final void firebase(C12222l c12222l, Function3 function3) {
        C13962l c13962lAmazon = amazon(c12222l);
        if (c13962lAmazon == null) {
            throw new C10021l("Phase " + c12222l + " was not registered for this pipeline", 3);
        }
        List list = (List) this.interceptors$delegate;
        if (!this.f21510l.isEmpty() && list != null && !this.f21513l && (!(list instanceof InterfaceC2356l) || (list instanceof InterfaceC4742l))) {
            if (AbstractC8576l.yandex(this.f21512l, c12222l)) {
                list.add(function3);
            } else if (c12222l == AbstractC16901l.m4214continue(this.f21510l) || purchase(c12222l) == AbstractC14055l.smaato(this.f21510l)) {
                C13962l c13962lAmazon2 = amazon(c12222l);
                if (c13962lAmazon2.amazon) {
                    c13962lAmazon2.crashlytics = new ArrayList(c13962lAmazon2.crashlytics);
                    c13962lAmazon2.amazon = false;
                }
                c13962lAmazon2.crashlytics.add(function3);
                list.add(function3);
            }
            this.f21509l++;
            return;
        }
        if (c13962lAmazon.amazon) {
            c13962lAmazon.crashlytics = new ArrayList(c13962lAmazon.crashlytics);
            c13962lAmazon.amazon = false;
        }
        c13962lAmazon.crashlytics.add(function3);
        this.f21509l++;
        this.interceptors$delegate = null;
        this.f21513l = false;
        this.f21512l = null;
        yandex();
    }

    public final void isPro(C12222l c12222l, C12222l c12222l2) {
        if (admob(c12222l2)) {
            return;
        }
        int iPurchase = purchase(c12222l);
        if (iPurchase != -1) {
            this.f21510l.add(iPurchase, new C13962l(c12222l2, new C11127l(c12222l)));
        } else {
            throw new C10021l("Phase " + c12222l + " was not registered for this pipeline", 3);
        }
    }

    public final Object loadAd(Object obj, Object obj2, AbstractC0283l abstractC0283l) {
        InterfaceC12932l interfaceC12932lMetrica = abstractC0283l.metrica();
        List listMetrica = metrica();
        return ((AbstractC0123l.yandex || mopub()) ? new C2046l(obj, listMetrica, obj2, interfaceC12932lMetrica) : new C8539l(obj2, obj, listMetrica)).yandex(obj2, abstractC0283l);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b A[LOOP:1: B:26:0x0057->B:34:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x006e A[EDGE_INSN: B:40:0x006e->B:35:0x006e BREAK  A[LOOP:1: B:26:0x0057->B:34:0x006b], SYNTHETIC] */
    public final List metrica() {
        ArrayList arrayList;
        int iSmaato;
        int i;
        Object obj;
        C13962l c13962l;
        int iSmaato2;
        if (((List) this.interceptors$delegate) == null) {
            int i2 = this.f21509l;
            if (i2 == 0) {
                this.interceptors$delegate = C2580l.f5619l;
                this.f21513l = false;
                this.f21512l = null;
            } else {
                ArrayList arrayList2 = this.f21510l;
                if (i2 != 1 || (iSmaato2 = AbstractC14055l.smaato(arrayList2)) < 0) {
                    arrayList = new ArrayList();
                    iSmaato = AbstractC14055l.smaato(arrayList2);
                    if (iSmaato >= 0) {
                        i = 0;
                        while (true) {
                            obj = arrayList2.get(i);
                            if (obj instanceof C13962l) {
                                c13962l = (C13962l) obj;
                            } else {
                                c13962l = null;
                            }
                            if (c13962l != null) {
                                c13962l.yandex(arrayList);
                            }
                            if (i != iSmaato) {
                                break;
                            }
                            i++;
                        }
                    }
                    this.interceptors$delegate = arrayList;
                    this.f21513l = false;
                    this.f21512l = null;
                } else {
                    int i3 = 0;
                    while (true) {
                        Object obj2 = arrayList2.get(i3);
                        C13962l c13962l2 = obj2 instanceof C13962l ? (C13962l) obj2 : null;
                        if (c13962l2 != null && !c13962l2.crashlytics.isEmpty()) {
                            List list = c13962l2.crashlytics;
                            c13962l2.amazon = true;
                            this.interceptors$delegate = list;
                            this.f21513l = false;
                            this.f21512l = c13962l2.yandex;
                        } else {
                            if (i3 == iSmaato2) {
                                break;
                            }
                            i3++;
                        }
                    }
                    arrayList = new ArrayList();
                    iSmaato = AbstractC14055l.smaato(arrayList2);
                    if (iSmaato >= 0) {
                        i = 0;
                        while (true) {
                            obj = arrayList2.get(i);
                            if (obj instanceof C13962l) {
                                c13962l = (C13962l) obj;
                            } else {
                                c13962l = null;
                            }
                            if (c13962l != null) {
                                c13962l.yandex(arrayList);
                            }
                            if (i != iSmaato) {
                                break;
                                break;
                            }
                            i++;
                        }
                    }
                    this.interceptors$delegate = arrayList;
                    this.f21513l = false;
                    this.f21512l = null;
                }
            }
        }
        this.f21513l = true;
        return (List) this.interceptors$delegate;
    }

    public abstract boolean mopub();

    public final int purchase(C12222l c12222l) {
        ArrayList arrayList = this.f21510l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c12222l || ((obj instanceof C13962l) && ((C13962l) obj).yandex == c12222l)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0011 A[SYNTHETIC] */
    public final void remoteconfig(AbstractC10598l abstractC10598l) {
        ArrayList arrayList = new ArrayList(abstractC10598l.f21510l);
        while (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C12222l c12222l = next instanceof C12222l ? (C12222l) next : null;
                if (c12222l == null) {
                    c12222l = ((C13962l) next).yandex;
                }
                if (admob(c12222l)) {
                    it.remove();
                } else {
                    Object obj = next == c12222l ? C10347l.purchase : ((C13962l) next).loadAd;
                    if (obj instanceof C10347l) {
                        if (!admob(c12222l)) {
                            this.f21510l.add(c12222l);
                        }
                    } else if (obj instanceof C11127l) {
                        C12222l c12222l2 = ((C11127l) obj).purchase;
                        if (admob(c12222l2)) {
                            isPro(c12222l2, c12222l);
                        } else if (obj instanceof C1517l) {
                            subs(((C1517l) obj).purchase, c12222l);
                        }
                    } else if (obj instanceof C1517l) {
                        subs(((C1517l) obj).purchase, c12222l);
                    }
                    it.remove();
                }
            }
        }
    }

    public final void smaato(AbstractC10598l abstractC10598l) {
        if (crashlytics(abstractC10598l)) {
            return;
        }
        remoteconfig(abstractC10598l);
        if (this.f21509l == 0) {
            this.interceptors$delegate = abstractC10598l.metrica();
            this.f21513l = true;
            this.f21512l = null;
        } else {
            this.interceptors$delegate = null;
            this.f21513l = false;
            this.f21512l = null;
        }
        for (Object obj : abstractC10598l.f21510l) {
            C12222l c12222l = obj instanceof C12222l ? (C12222l) obj : null;
            if (c12222l == null) {
                c12222l = ((C13962l) obj).yandex;
            }
            if (obj instanceof C13962l) {
                C13962l c13962l = (C13962l) obj;
                if (!c13962l.crashlytics.isEmpty()) {
                    C13962l c13962lAmazon = amazon(c12222l);
                    if (!c13962l.crashlytics.isEmpty()) {
                        if (c13962lAmazon.crashlytics.isEmpty()) {
                            c13962l.amazon = true;
                            c13962lAmazon.crashlytics = c13962l.crashlytics;
                            c13962lAmazon.amazon = true;
                        } else {
                            if (c13962lAmazon.amazon) {
                                c13962lAmazon.crashlytics = new ArrayList(c13962lAmazon.crashlytics);
                                c13962lAmazon.amazon = false;
                            }
                            c13962l.yandex(c13962lAmazon.crashlytics);
                        }
                    }
                    this.f21509l = c13962l.crashlytics.size() + this.f21509l;
                }
            }
        }
    }

    public final void subs(C12222l c12222l, C12222l c12222l2) {
        AbstractC17653l abstractC17653l;
        if (admob(c12222l2)) {
            return;
        }
        int iPurchase = purchase(c12222l);
        if (iPurchase == -1) {
            throw new C10021l("Phase " + c12222l + " was not registered for this pipeline", 3);
        }
        int i = iPurchase + 1;
        ArrayList arrayList = this.f21510l;
        int iSmaato = AbstractC14055l.smaato(arrayList);
        if (i <= iSmaato) {
            while (true) {
                Object obj = arrayList.get(i);
                C13962l c13962l = obj instanceof C13962l ? (C13962l) obj : null;
                if (c13962l != null && (abstractC17653l = c13962l.loadAd) != null) {
                    C1517l c1517l = abstractC17653l instanceof C1517l ? (C1517l) abstractC17653l : null;
                    if (c1517l != null && c1517l.purchase == c12222l) {
                        iPurchase = i;
                    }
                    if (i == iSmaato) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    break;
                }
            }
        }
        arrayList.add(iPurchase + 1, new C13962l(c12222l2, new C1517l(c12222l)));
    }

    public void yandex() {
    }
}
