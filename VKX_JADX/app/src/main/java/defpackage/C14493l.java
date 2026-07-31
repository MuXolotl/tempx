package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lٓۢۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14493l implements InterfaceC2743l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C11406l f28368l = new C11406l(new C2922l(2), C0058l.f957l);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long[] f28369l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC1186l f28370l;

    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    public C14493l(C13708l c13708l) {
        int i = c13708l.f26765l;
        long j = -9223372036854775807L;
        int i2 = 0;
        if (i == 1) {
            C9258l c9258lListIterator = c13708l.listIterator(0);
            Object next = c9258lListIterator.next();
            if (c9258lListIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i2 < 4 && c9258lListIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(c9258lListIterator.next());
                    i2++;
                }
                if (c9258lListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            C8755l c8755l = (C8755l) next;
            long j2 = c8755l.loadAd;
            long j3 = c8755l.crashlytics;
            long j4 = j2 == -9223372036854775807L ? 0L : j2;
            AbstractC1186l abstractC1186l = c8755l.yandex;
            if (j3 == -9223372036854775807L) {
                this.f28370l = AbstractC1186l.isVip(abstractC1186l);
                this.f28369l = new long[]{j4};
                return;
            } else {
                C9258l c9258l = AbstractC1186l.f3181l;
                this.f28370l = AbstractC1186l.signatures(abstractC1186l, C13708l.f26763l);
                this.f28369l = new long[]{j4, j3 + j4};
                return;
            }
        }
        long[] jArr = new long[i * 2];
        this.f28369l = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        C13708l c13708lAppmetrica = AbstractC1186l.appmetrica(f28368l, c13708l);
        int i3 = 0;
        while (i2 < c13708lAppmetrica.f26765l) {
            C8755l c8755l2 = (C8755l) c13708lAppmetrica.get(i2);
            long j5 = c8755l2.loadAd;
            long j6 = c8755l2.crashlytics;
            AbstractC1186l abstractC1186l2 = c8755l2.yandex;
            j5 = j5 == j ? 0L : j5;
            long j7 = j5 + j6;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j8 = this.f28369l[i4];
                if (j8 < j5) {
                    this.f28369l[i3] = j5;
                    arrayList.add(abstractC1186l2);
                    i3++;
                } else if (j8 == j5 && ((AbstractC1186l) arrayList.get(i4)).isEmpty()) {
                    arrayList.set(i4, abstractC1186l2);
                } else {
                    AbstractC6427l.vip("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f28369l[i4] = j5;
                    arrayList.set(i4, abstractC1186l2);
                }
            } else {
                this.f28369l[i3] = j5;
                arrayList.add(abstractC1186l2);
                i3++;
            }
            if (j6 != j) {
                this.f28369l[i3] = j7;
                arrayList.add(C13708l.f26763l);
                i3++;
            }
            i2++;
            j = j;
        }
        this.f28370l = AbstractC1186l.Signature(arrayList);
    }

    @Override // defpackage.InterfaceC2743l
    public final long firebase(int i) {
        AbstractC12442l.admob(i < this.f28370l.size());
        return this.f28369l[i];
    }

    @Override // defpackage.InterfaceC2743l
    public final List metrica(long j) {
        int iBilling = AbstractC15323l.billing(this.f28369l, j, false);
        if (iBilling != -1) {
            return (AbstractC1186l) this.f28370l.get(iBilling);
        }
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC2743l
    public final int purchase(long j) {
        int iLoadAd = AbstractC15323l.loadAd(this.f28369l, j, false);
        if (iLoadAd < this.f28370l.size()) {
            return iLoadAd;
        }
        return -1;
    }

    @Override // defpackage.InterfaceC2743l
    public final int subscription() {
        return this.f28370l.size();
    }
}
