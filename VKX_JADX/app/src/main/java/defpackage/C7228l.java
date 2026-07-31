package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًؚْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7228l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C8464l f15061l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f15062l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7228l(C8464l c8464l, int i) {
        super(0);
        this.f15062l = i;
        this.f15061l = c8464l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f15062l;
        C8464l c8464l = this.f15061l;
        switch (i) {
            case 0:
                c8464l.getLayoutNode().inmobi();
                return Unit.INSTANCE;
            case 1:
                if (c8464l.f1325l && c8464l.isAttachedToWindow() && c8464l.getView().getParent() == c8464l) {
                    C5227l snapshotObserver = c8464l.getSnapshotObserver();
                    snapshotObserver.yandex.crashlytics(c8464l, C11192l.f22536l, c8464l.getUpdate());
                }
                return Unit.INSTANCE;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                c8464l.f17498l.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                c8464l.getReleaseBlock().invoke(c8464l.f17498l);
                C8464l.vip(c8464l);
                return Unit.INSTANCE;
            case 4:
                c8464l.getResetBlock().invoke(c8464l.f17498l);
                return Unit.INSTANCE;
            default:
                c8464l.getUpdateBlock().invoke(c8464l.f17498l);
                return Unit.INSTANCE;
        }
    }
}
