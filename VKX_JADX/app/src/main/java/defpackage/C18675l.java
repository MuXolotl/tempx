package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: lْۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18675l implements InterfaceC1003l, InterfaceC9432l, InterfaceC12202l, InterfaceC10377l, InterfaceC16369l, InterfaceC11545l, InterfaceC17327l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f36444l;

    public /* synthetic */ C18675l() {
        this.f36444l = new CountDownLatch(1);
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        C13132l c13132l = new C13132l((C2350l) obj2);
        String str = ((C10828l) this.f36444l).f21889l;
        C13452l c13452l = (C13452l) ((C11963l) obj).metrica();
        BinderC13190l binderC13190l = new BinderC13190l(c13132l);
        Parcel parcelM743l = c13452l.m743l();
        int i = AbstractC14866l.yandex;
        parcelM743l.writeInt(1);
        int iTapsense = AbstractC9968l.tapsense(parcelM743l, 20293);
        AbstractC9968l.admob(parcelM743l, 1, binderC13190l);
        AbstractC9968l.vip(parcelM743l, 2, str);
        AbstractC9968l.subscription(parcelM743l, 3, 4);
        parcelM743l.writeInt(0);
        AbstractC9968l.Signature(parcelM743l, iTapsense);
        c13452l.m742l(parcelM743l, 2007);
    }

    @Override // defpackage.InterfaceC10377l
    public void adcel(Exception exc) {
        ((CountDownLatch) this.f36444l).countDown();
    }

    @Override // defpackage.InterfaceC17327l
    public Point[] admob() {
        return ((C3212l) this.f36444l).f6895l;
    }

    @Override // defpackage.InterfaceC12202l
    public void amazon(Object obj) {
        ((CountDownLatch) this.f36444l).countDown();
    }

    @Override // defpackage.InterfaceC9432l
    public InterfaceC13081l billing(C16150l c16150l) {
        return new C13645l(this, c16150l, false, 22);
    }

    @Override // defpackage.InterfaceC17327l
    public String crashlytics() {
        return ((C3212l) this.f36444l).f6888l;
    }

    @Override // defpackage.InterfaceC17327l
    public int getFormat() {
        return ((C3212l) this.f36444l).f6892l;
    }

    public void isPro(int i, String str, List list, boolean z, boolean z2) {
        C14906l c14906l;
        C8315l c8315l = (C8315l) this.f36444l;
        int i2 = i - 1;
        if (i2 == 0) {
            C8118l c8118l = ((C17417l) c8315l.f833l).f33950l;
            C17417l.admob(c8118l);
            c14906l = c8118l.f16918l;
        } else if (i2 != 1) {
            if (i2 == 3) {
                C8118l c8118l2 = ((C17417l) c8315l.f833l).f33950l;
                C17417l.admob(c8118l2);
                c14906l = c8118l2.f16911l;
            } else if (i2 != 4) {
                C8118l c8118l3 = ((C17417l) c8315l.f833l).f33950l;
                C17417l.admob(c8118l3);
                c14906l = c8118l3.f16907l;
            } else if (z) {
                C8118l c8118l4 = ((C17417l) c8315l.f833l).f33950l;
                C17417l.admob(c8118l4);
                c14906l = c8118l4.f16917l;
            } else if (z2) {
                C8118l c8118l5 = ((C17417l) c8315l.f833l).f33950l;
                C17417l.admob(c8118l5);
                c14906l = c8118l5.f16910l;
            } else {
                C8118l c8118l6 = ((C17417l) c8315l.f833l).f33950l;
                C17417l.admob(c8118l6);
                c14906l = c8118l6.f16914l;
            }
        } else if (z) {
            C8118l c8118l7 = ((C17417l) c8315l.f833l).f33950l;
            C17417l.admob(c8118l7);
            c14906l = c8118l7.f16909l;
        } else if (z2) {
            C8118l c8118l8 = ((C17417l) c8315l.f833l).f33950l;
            C17417l.admob(c8118l8);
            c14906l = c8118l8.f16908l;
        } else {
            C8118l c8118l9 = ((C17417l) c8315l.f833l).f33950l;
            C17417l.admob(c8118l9);
            c14906l = c8118l9.f16915l;
        }
        int size = list.size();
        if (size == 1) {
            c14906l.loadAd(list.get(0), str);
            return;
        }
        if (size == 2) {
            c14906l.crashlytics(list.get(0), list.get(1), str);
        } else if (size != 3) {
            c14906l.yandex(str);
        } else {
            c14906l.amazon(str, list.get(0), list.get(1), list.get(2));
        }
    }

    @Override // defpackage.InterfaceC17327l
    public Rect loadAd() {
        Point[] pointArr = ((C3212l) this.f36444l).f6895l;
        if (pointArr == null) {
            return null;
        }
        int iMax = RecyclerView.UNDEFINED_DURATION;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : pointArr) {
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    @Override // defpackage.InterfaceC16369l
    public void mopub() {
        ((CountDownLatch) this.f36444l).countDown();
    }

    @Override // defpackage.InterfaceC17327l
    public int purchase() {
        return ((C3212l) this.f36444l).f6899l;
    }

    @Override // defpackage.InterfaceC1003l
    public FileChannel subs() {
        return new FileInputStream((File) this.f36444l).getChannel();
    }

    @Override // defpackage.InterfaceC9432l
    public C16150l yandex(int i) {
        List list = (List) ((SparseArray) this.f36444l).get(i);
        if (list != null && !list.isEmpty()) {
            return (C16150l) list.get(0);
        }
        C8339l.metrica(AbstractC0653l.vip(i, "Cannot find the wrapper for global view type "));
        return null;
    }

    public /* synthetic */ C18675l(Object obj) {
        this.f36444l = obj;
    }
}
