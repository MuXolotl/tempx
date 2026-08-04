package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؚّٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7214l implements InterfaceC17327l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f15044l;

    public /* synthetic */ C7214l(Object obj) {
        this.f15044l = obj;
    }

    @Override // defpackage.InterfaceC17327l
    public Point[] admob() {
        return ((C17468l) this.f15044l).f34031l;
    }

    @Override // defpackage.InterfaceC17327l
    public String crashlytics() {
        return ((C17468l) this.f15044l).f34026l;
    }

    @Override // defpackage.InterfaceC17327l
    public int getFormat() {
        return ((C17468l) this.f15044l).f34027l;
    }

    @Override // defpackage.InterfaceC17327l
    public Rect loadAd() {
        C17468l c17468l = (C17468l) this.f15044l;
        if (c17468l.f34031l == null) {
            return null;
        }
        int i = 0;
        int iMax = RecyclerView.UNDEFINED_DURATION;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = c17468l.f34031l;
            if (i >= pointArr.length) {
                return new Rect(iMin, iMin2, iMax, iMax2);
            }
            Point point = pointArr[i];
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i++;
        }
    }

    @Override // defpackage.InterfaceC17327l
    public int purchase() {
        return ((C17468l) this.f15044l).f34032l;
    }
}
