package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؑؗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0132l extends AbstractC1299l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public int f1036l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public int f1037l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public ArrayList f1038l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public boolean f1039l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public boolean f1040l;

    @Override // defpackage.AbstractC1299l
    public final void admob(C18285l c18285l) {
        View view = c18285l.loadAd;
        if (license(view)) {
            for (AbstractC1299l abstractC1299l : this.f1038l) {
                if (abstractC1299l.license(view)) {
                    abstractC1299l.admob(c18285l);
                    c18285l.crashlytics.add(abstractC1299l);
                }
            }
        }
    }

    @Override // defpackage.AbstractC1299l
    public final void advert(View view) {
        super.advert(view);
        int size = this.f1038l.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1299l) this.f1038l.get(i)).advert(view);
        }
    }

    @Override // defpackage.AbstractC1299l
    public final void amazon(C18285l c18285l) {
        View view = c18285l.loadAd;
        if (license(view)) {
            for (AbstractC1299l abstractC1299l : this.f1038l) {
                if (abstractC1299l.license(view)) {
                    abstractC1299l.amazon(c18285l);
                    c18285l.crashlytics.add(abstractC1299l);
                }
            }
        }
    }

    @Override // defpackage.AbstractC1299l
    public final void applovin() {
        ArrayList arrayList;
        if (this.f1038l.isEmpty()) {
            m865native();
            vip();
            return;
        }
        C17566l c17566l = new C17566l();
        c17566l.loadAd = this;
        Iterator it = this.f1038l.iterator();
        while (it.hasNext()) {
            ((AbstractC1299l) it.next()).yandex(c17566l);
        }
        this.f1037l = this.f1038l.size();
        if (this.f1040l) {
            Iterator it2 = this.f1038l.iterator();
            while (it2.hasNext()) {
                ((AbstractC1299l) it2.next()).applovin();
            }
            return;
        }
        int i = 1;
        while (true) {
            int size = this.f1038l.size();
            arrayList = this.f1038l;
            if (i >= size) {
                break;
            }
            ((AbstractC1299l) arrayList.get(i - 1)).yandex(new C17566l((AbstractC1299l) this.f1038l.get(i), 2));
            i++;
        }
        AbstractC1299l abstractC1299l = (AbstractC1299l) arrayList.get(0);
        if (abstractC1299l != null) {
            abstractC1299l.applovin();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC1299l
    public final void appmetrica(long j, long j2) {
        long j3;
        long j4 = this.f3377l;
        long j5 = 0;
        if (this.f3372l != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.f3376l = false;
            ad(this, C1759l.f4169l, z);
        }
        if (!this.f1040l) {
            int size = 1;
            while (true) {
                int size2 = this.f1038l.size();
                ArrayList arrayList = this.f1038l;
                if (size >= size2) {
                    size = arrayList.size();
                    break;
                } else if (((AbstractC1299l) arrayList.get(size)).f3362l > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i < this.f1038l.size()) {
                        AbstractC1299l abstractC1299l = (AbstractC1299l) this.f1038l.get(i);
                        long j6 = abstractC1299l.f3362l;
                        j3 = j5;
                        long j7 = j - j6;
                        if (j7 < j3) {
                            break;
                        }
                        abstractC1299l.appmetrica(j7, j2 - j6);
                        i++;
                        j5 = j3;
                    }
                }
            } else {
                j3 = 0;
                while (i >= 0) {
                    AbstractC1299l abstractC1299l2 = (AbstractC1299l) this.f1038l.get(i);
                    long j8 = abstractC1299l2.f3362l;
                    long j9 = j - j8;
                    abstractC1299l2.appmetrica(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            if (this.f3372l != null) {
                if ((j > j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.f3376l = true;
                }
                ad(this, C1759l.f4168l, z);
            }
        }
        for (int i2 = 0; i2 < this.f1038l.size(); i2++) {
            ((AbstractC1299l) this.f1038l.get(i2)).appmetrica(j, j2);
        }
        j3 = j5;
        if (this.f3372l != null) {
            if (j > j4) {
                return;
            } else {
                return;
            }
            if (j > j4) {
                this.f3376l = true;
            }
            ad(this, C1759l.f4168l, z);
        }
    }

    @Override // defpackage.AbstractC1299l
    public final void billing(C18285l c18285l) {
        int size = this.f1038l.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1299l) this.f1038l.get(i)).billing(c18285l);
        }
    }

    @Override // defpackage.AbstractC1299l
    public final void crashlytics() {
        super.crashlytics();
        int size = this.f1038l.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1299l) this.f1038l.get(i)).crashlytics();
        }
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m277extends(AbstractC1299l abstractC1299l) {
        this.f1038l.add(abstractC1299l);
        abstractC1299l.f3372l = this;
        long j = this.f3356l;
        if (j >= 0) {
            abstractC1299l.inmobi(j);
        }
        if ((this.f1036l & 1) != 0) {
            abstractC1299l.mo278package(this.f3370l);
        }
        if ((this.f1036l & 2) != 0) {
            abstractC1299l.mo280strictfp();
        }
        if ((this.f1036l & 4) != 0) {
            abstractC1299l.mo281synchronized(this.f3354l);
        }
        if ((this.f1036l & 8) != 0) {
            abstractC1299l.mo282throws(null);
        }
    }

    @Override // defpackage.AbstractC1299l
    /* JADX INFO: renamed from: firebase */
    public final AbstractC1299l clone() {
        C0132l c0132l = (C0132l) super.clone();
        c0132l.f1038l = new ArrayList();
        int size = this.f1038l.size();
        for (int i = 0; i < size; i++) {
            AbstractC1299l abstractC1299lClone = ((AbstractC1299l) this.f1038l.get(i)).clone();
            c0132l.f1038l.add(abstractC1299lClone);
            abstractC1299lClone.f3372l = c0132l;
        }
        return c0132l;
    }

    @Override // defpackage.AbstractC1299l
    public final void inmobi(long j) {
        ArrayList arrayList;
        this.f3356l = j;
        if (j < 0 || (arrayList = this.f1038l) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1299l) this.f1038l.get(i)).inmobi(j);
        }
    }

    @Override // defpackage.AbstractC1299l
    public final void isVip() {
        this.f3377l = 0L;
        int i = 0;
        C17566l c17566l = new C17566l(this, i);
        while (i < this.f1038l.size()) {
            AbstractC1299l abstractC1299l = (AbstractC1299l) this.f1038l.get(i);
            abstractC1299l.yandex(c17566l);
            abstractC1299l.isVip();
            long j = abstractC1299l.f3377l;
            boolean z = this.f1040l;
            long j2 = this.f3377l;
            if (z) {
                this.f3377l = Math.max(j2, j);
            } else {
                abstractC1299l.f3362l = j2;
                this.f3377l = j2 + j;
            }
            i++;
        }
    }

    @Override // defpackage.AbstractC1299l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void mo278package(TimeInterpolator timeInterpolator) {
        this.f1036l |= 1;
        ArrayList arrayList = this.f1038l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC1299l) this.f1038l.get(i)).mo278package(timeInterpolator);
            }
        }
        this.f3370l = timeInterpolator;
    }

    @Override // defpackage.AbstractC1299l
    public final void premium(View view) {
        super.premium(view);
        int size = this.f1038l.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1299l) this.f1038l.get(i)).premium(view);
        }
    }

    @Override // defpackage.AbstractC1299l
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final String mo279private(String str) {
        String strMo279private = super.mo279private(str);
        for (int i = 0; i < this.f1038l.size(); i++) {
            StringBuilder sbAdvert = AbstractC5020l.advert(strMo279private, "\n");
            sbAdvert.append(((AbstractC1299l) this.f1038l.get(i)).mo279private(str.concat("  ")));
            strMo279private = sbAdvert.toString();
        }
        return strMo279private;
    }

    @Override // defpackage.AbstractC1299l
    public final void remoteconfig(ViewGroup viewGroup, C12014l c12014l, C12014l c12014l2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f3363l;
        int size = this.f1038l.size();
        for (int i = 0; i < size; i++) {
            AbstractC1299l abstractC1299l = (AbstractC1299l) this.f1038l.get(i);
            if (j > 0 && (this.f1040l || i == 0)) {
                long j2 = abstractC1299l.f3363l;
                if (j2 > 0) {
                    abstractC1299l.mo283volatile(j2 + j);
                } else {
                    abstractC1299l.mo283volatile(j);
                }
            }
            abstractC1299l.remoteconfig(viewGroup, c12014l, c12014l2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.AbstractC1299l
    public final AbstractC1299l signatures(InterfaceC4788l interfaceC4788l) {
        super.signatures(interfaceC4788l);
        return this;
    }

    @Override // defpackage.AbstractC1299l
    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void mo280strictfp() {
        this.f1036l |= 2;
        int size = this.f1038l.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1299l) this.f1038l.get(i)).mo280strictfp();
        }
    }

    @Override // defpackage.AbstractC1299l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void mo281synchronized(C6565l c6565l) {
        super.mo281synchronized(c6565l);
        this.f1036l |= 4;
        if (this.f1038l != null) {
            for (int i = 0; i < this.f1038l.size(); i++) {
                ((AbstractC1299l) this.f1038l.get(i)).mo281synchronized(c6565l);
            }
        }
    }

    @Override // defpackage.AbstractC1299l
    public final boolean tapsense() {
        for (int i = 0; i < this.f1038l.size(); i++) {
            if (((AbstractC1299l) this.f1038l.get(i)).tapsense()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC1299l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void mo282throws(AbstractC6604l abstractC6604l) {
        this.f1036l |= 8;
        int size = this.f1038l.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1299l) this.f1038l.get(i)).mo282throws(abstractC6604l);
        }
    }

    @Override // defpackage.AbstractC1299l
    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void mo283volatile(long j) {
        this.f3363l = j;
    }
}
