package defpackage;

import android.graphics.Point;
import android.os.Bundle;
import android.os.IInterface;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.car.app.isPro;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lْؑ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0615l implements InterfaceC18044l, InterfaceC6610l, InterfaceC0119l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f2071l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f2072l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f2073l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f2074l;

    public /* synthetic */ C0615l(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f2072l = obj;
        this.f2073l = obj2;
        this.f2071l = obj3;
        this.f2074l = obj4;
    }

    @Override // defpackage.InterfaceC6610l
    public Object call() {
        isPro ispro = (isPro) this.f2072l;
        String str = (String) this.f2073l;
        String str2 = (String) this.f2071l;
        InterfaceC1082l interfaceC1082l = (InterfaceC1082l) this.f2074l;
        IInterface iInterfaceYandex = ispro.yandex(str);
        if (iInterfaceYandex != null) {
            return interfaceC1082l.firebase(iInterfaceYandex);
        }
        Log.e("CarApp.Dispatch", "Could not retrieve host while dispatching call ".concat(str2));
        return null;
    }

    @Override // defpackage.InterfaceC0119l
    public void crashlytics(C6499l c6499l) {
        C13350l c13350l = (C13350l) this.f2072l;
        C12417l c12417l = (C12417l) this.f2073l;
        Bundle bundle = (Bundle) this.f2071l;
        ResultReceiver resultReceiver = (ResultReceiver) this.f2074l;
        C3726l c3726l = c13350l.admob;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        ListenableFuture listenableFutureTapsense = c3726l.tapsense(c6499l, c12417l, bundle);
        if (resultReceiver != null) {
            listenableFutureTapsense.yandex(new RunnableC12388l(listenableFutureTapsense, resultReceiver, 21), EnumC1535l.f3808l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    @Override // defpackage.InterfaceC18044l
    public C13708l subs(int i, C11916l c11916l, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        C11916l c11916l2 = c11916l;
        C9205l c9205l = (C9205l) this.f2072l;
        String str = (String) this.f2073l;
        int[] iArr2 = (int[]) this.f2071l;
        Point point = (Point) this.f2074l;
        int i6 = iArr2[i];
        int i7 = point != null ? point.x : c9205l.subs;
        int i8 = point != null ? point.y : c9205l.isPro;
        boolean z = c9205l.smaato;
        if (i7 == Integer.MAX_VALUE || i8 == Integer.MAX_VALUE) {
            i2 = Alert.DURATION_SHOW_INDEFINITELY;
        } else {
            int i9 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < c11916l2.yandex; i10++) {
                C5978l c5978l = c11916l2.amazon[i10];
                int i11 = c5978l.license;
                int i12 = c5978l.pro;
                if (i11 > 0 && i12 > 0) {
                    if (!z) {
                        i4 = i8;
                        i5 = i7;
                    } else if ((i11 > i12) != (i7 > i8)) {
                        i5 = i8;
                        i4 = i7;
                    } else {
                        i4 = i8;
                        i5 = i7;
                    }
                    int i13 = i11 * i4;
                    int i14 = i12 * i5;
                    Point point2 = i13 >= i14 ? new Point(i5, AbstractC15323l.mopub(i14, i11)) : new Point(AbstractC15323l.mopub(i13, i12), i4);
                    int i15 = c5978l.license;
                    int i16 = i15 * i12;
                    if (i15 >= ((int) (point2.x * 0.98f)) && i12 >= ((int) (point2.y * 0.98f)) && i16 < i9) {
                        i9 = i16;
                    }
                }
            }
            i2 = i9;
        }
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        int i17 = 0;
        while (i17 < c11916l2.yandex) {
            C5978l c5978l2 = c11916l2.amazon[i17];
            int i18 = c5978l2.license;
            int i19 = (i18 == -1 || (i3 = c5978l2.pro) == -1) ? -1 : i18 * i3;
            c16971lMetrica.crashlytics(new C12120l(i, c11916l2, i17, c9205l, iArr[i17], str, i6, i2 == Integer.MAX_VALUE || (i19 != -1 && i19 <= i2)));
            i17++;
            c11916l2 = c11916l;
        }
        return c16971lMetrica.mopub();
    }
}
