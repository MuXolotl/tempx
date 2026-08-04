package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: renamed from: lٍِۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9496l implements InterfaceC12538l {
    public final /* synthetic */ C18289l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C9496l(C18289l c18289l, int i) {
        this.yandex = i;
        this.loadAd = c18289l;
    }

    @Override // defpackage.InterfaceC12538l
    public final ListenableFuture apply(Object obj) throws IOException {
        ListenableFuture listenableFuture;
        int i = this.yandex;
        C18289l c18289l = this.loadAd;
        switch (i) {
            case 0:
                synchronized (c18289l.subs) {
                    listenableFuture = (ListenableFuture) c18289l.firebase;
                    break;
                }
                return listenableFuture;
            case 1:
                return AbstractC7151l.purchase(c18289l.vip((Uri) AbstractC7151l.crashlytics((ListenableFuture) c18289l.crashlytics)));
            case 2:
                c18289l.metrica((Uri) AbstractC7151l.crashlytics((ListenableFuture) c18289l.crashlytics), obj);
                return C5113l.f11111l;
            default:
                Uri uri = (Uri) obj;
                Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                try {
                    C2830l c2830l = (C2830l) c18289l.billing;
                    C1381l c1381lLoadAd = c2830l.loadAd(uriBuild);
                    if (((InterfaceC14033l) c1381lLoadAd.f3513l).loadAd((Uri) c1381lLoadAd.f3514l)) {
                        C1381l c1381lLoadAd2 = c2830l.loadAd(uriBuild);
                        C1381l c1381lLoadAd3 = c2830l.loadAd(uri);
                        InterfaceC14033l interfaceC14033l = (InterfaceC14033l) c1381lLoadAd2.f3513l;
                        if (interfaceC14033l != ((InterfaceC14033l) c1381lLoadAd3.f3513l)) {
                            throw new C8413l("Cannot rename file across backends");
                        }
                        interfaceC14033l.billing((Uri) c1381lLoadAd2.f3514l, (Uri) c1381lLoadAd3.f3514l);
                    }
                    return C5113l.f11111l;
                } catch (IOException e) {
                    return AbstractC7151l.amazon(e);
                }
        }
    }
}
