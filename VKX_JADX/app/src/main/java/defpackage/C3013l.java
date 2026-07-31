package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lِؔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3013l implements InterfaceC12538l {
    public final Object crashlytics;
    public final Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C3013l(Object obj, Object obj2, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = obj2;
    }

    @Override // defpackage.InterfaceC12538l
    public final ListenableFuture apply(Object obj) throws IOException {
        switch (this.yandex) {
            case 0:
                C7258l c7258l = (C7258l) this.loadAd;
                return ((C18222l) c7258l.amazon.get()).yandex(new C12224l(c7258l, (InterfaceC7674l) this.crashlytics));
            case 1:
                List list = (List) this.loadAd;
                C15174l c15174l = (C15174l) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw AbstractC15560l.adcel(it);
                }
                C3013l c3013lLoadAd = AbstractC6854l.loadAd(new C0829l(this, arrayList, size));
                EnumC1535l enumC1535l = EnumC1535l.f3808l;
                return AbstractC7151l.admob(AbstractC7151l.mopub(AbstractC7151l.admob(AbstractC7151l.billing(c15174l.yandex.purchase.m952l()), AbstractC6854l.loadAd(new C3013l(c15174l, c3013lLoadAd, 3)), enumC1535l), new C5626l(), enumC1535l), AbstractC6854l.loadAd(new C0829l(this, size, arrayList)), enumC1535l);
            case 2:
                C18289l c18289l = (C18289l) this.loadAd;
                C18012l c18012l = (C18012l) this.crashlytics;
                c18289l.metrica((Uri) AbstractC7151l.crashlytics((ListenableFuture) c18289l.crashlytics), obj);
                synchronized (c18289l.subs) {
                    c18289l.firebase = c18012l;
                    break;
                }
                return AbstractC7151l.purchase(obj);
            case 3:
                return ((C15174l) this.loadAd).yandex.crashlytics.remoteconfig((C3013l) this.crashlytics, EnumC1535l.f3808l);
            default:
                InterfaceC14094l interfaceC14094l = (InterfaceC14094l) this.loadAd;
                C9226l c9226lLoadAd = AbstractC10540l.loadAd();
                InterfaceC14094l interfaceC14094lYandex = AbstractC10540l.yandex(c9226lLoadAd, interfaceC14094l);
                try {
                    ListenableFuture listenableFutureApply = ((InterfaceC12538l) this.crashlytics).apply(obj);
                    if (listenableFutureApply == null) {
                        throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
                    }
                    AbstractC10540l.yandex(c9226lLoadAd, interfaceC14094lYandex);
                    return listenableFutureApply;
                } catch (Throwable th) {
                    try {
                        AbstractC18239l.yandex(th);
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC10540l.yandex(c9226lLoadAd, interfaceC14094lYandex);
                        throw th2;
                    }
                }
        }
    }

    public String toString() {
        switch (this.yandex) {
            case 4:
                InterfaceC12538l interfaceC12538l = (InterfaceC12538l) this.crashlytics;
                StringBuilder sb = new StringBuilder(interfaceC12538l.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(interfaceC12538l);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
