package defpackage;

import androidx.car.app.model.Alert;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lٌُۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8710l extends AbstractC7735l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final int[] f17918l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC7735l f17919l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f17920l = 0;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f17921l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f17922l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC7735l f17923l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f17924l;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY));
        f17918l = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f17918l;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public C8710l(AbstractC7735l abstractC7735l, AbstractC7735l abstractC7735l2) {
        this.f17919l = abstractC7735l;
        this.f17923l = abstractC7735l2;
        int size = abstractC7735l.size();
        this.f17922l = size;
        this.f17921l = abstractC7735l2.size() + size;
        this.f17924l = Math.max(abstractC7735l.firebase(), abstractC7735l2.firebase()) + 1;
    }

    @Override // defpackage.AbstractC7735l
    public final void admob(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        AbstractC7735l abstractC7735l = this.f17919l;
        int i5 = this.f17922l;
        if (i4 <= i5) {
            abstractC7735l.admob(bArr, i, i2, i3);
            return;
        }
        AbstractC7735l abstractC7735l2 = this.f17923l;
        if (i >= i5) {
            abstractC7735l2.admob(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        abstractC7735l.admob(bArr, i, i2, i6);
        abstractC7735l2.admob(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // defpackage.AbstractC7735l
    public final int ads(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC7735l abstractC7735l = this.f17919l;
        int i5 = this.f17922l;
        if (i4 <= i5) {
            return abstractC7735l.ads(i, i2, i3);
        }
        AbstractC7735l abstractC7735l2 = this.f17923l;
        if (i2 >= i5) {
            return abstractC7735l2.ads(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC7735l2.ads(abstractC7735l.ads(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.AbstractC7735l
    public final void advert(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        AbstractC7735l abstractC7735l = this.f17919l;
        int i4 = this.f17922l;
        if (i3 <= i4) {
            abstractC7735l.advert(outputStream, i, i2);
            return;
        }
        AbstractC7735l abstractC7735l2 = this.f17923l;
        if (i >= i4) {
            abstractC7735l2.advert(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        abstractC7735l.advert(outputStream, i, i5);
        abstractC7735l2.advert(outputStream, 0, i2 - i5);
    }

    public final boolean equals(Object obj) {
        int iTapsense;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7735l) {
            AbstractC7735l abstractC7735l = (AbstractC7735l) obj;
            int size = abstractC7735l.size();
            int i = this.f17921l;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.f17920l == 0 || (iTapsense = abstractC7735l.tapsense()) == 0 || this.f17920l == iTapsense) {
                    C5191l c5191l = new C5191l(this);
                    C7362l c7362lYandex = c5191l.yandex();
                    C5191l c5191l2 = new C5191l(abstractC7735l);
                    C7362l c7362lYandex2 = c5191l2.yandex();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = c7362lYandex.f15271l.length - i2;
                        int length2 = c7362lYandex2.f15271l.length - i3;
                        int iMin = Math.min(length, length2);
                        if (!(i2 == 0 ? c7362lYandex.isVip(c7362lYandex2, i3, iMin) : c7362lYandex2.isVip(c7362lYandex, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            C18073l.admob();
                            return false;
                        }
                        if (iMin == length) {
                            c7362lYandex = c5191l.yandex();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == length2) {
                            c7362lYandex2 = c5191l2.yandex();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC7735l
    public final int firebase() {
        return this.f17924l;
    }

    public final int hashCode() {
        int iMetrica = this.f17920l;
        if (iMetrica == 0) {
            int i = this.f17921l;
            iMetrica = metrica(i, 0, i);
            if (iMetrica == 0) {
                iMetrica = 1;
            }
            this.f17920l = iMetrica;
        }
        return iMetrica;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C12289l(this);
    }

    @Override // defpackage.AbstractC7735l
    public final int metrica(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC7735l abstractC7735l = this.f17919l;
        int i5 = this.f17922l;
        if (i4 <= i5) {
            return abstractC7735l.metrica(i, i2, i3);
        }
        AbstractC7735l abstractC7735l2 = this.f17923l;
        if (i2 >= i5) {
            return abstractC7735l2.metrica(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC7735l2.metrica(abstractC7735l.metrica(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.AbstractC7735l
    public final String pro() {
        return new String(Signature(), "UTF-8");
    }

    @Override // defpackage.AbstractC7735l
    public final boolean remoteconfig() {
        int iAds = this.f17919l.ads(0, 0, this.f17922l);
        AbstractC7735l abstractC7735l = this.f17923l;
        return abstractC7735l.ads(iAds, 0, abstractC7735l.size()) == 0;
    }

    @Override // defpackage.AbstractC7735l
    public final int size() {
        return this.f17921l;
    }

    @Override // defpackage.AbstractC7735l
    public final boolean smaato() {
        return this.f17921l >= f17918l[this.f17924l];
    }

    @Override // defpackage.AbstractC7735l
    public final int tapsense() {
        return this.f17920l;
    }
}
