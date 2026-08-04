package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: renamed from: lًؘٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5848l extends ContentObserver {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5848l(C15615l c15615l) {
        super(null);
        this.yandex = 2;
        this.loadAd = c15615l;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C18572l c18572l = (C18572l) obj;
                boolean z2 = Settings.System.getInt(c18572l.f36258l, "reduce_animations", 0) == 0;
                if (c18572l.f36260l != null) {
                    C16552l c16552l = AbstractC11463l.yandex;
                    AbstractC10999l.mopub(AbstractC11990l.yandex(AbstractC17278l.yandex), null, 0, new C14047l(c18572l, z2, null, 2), 3);
                }
                break;
            case 1:
            default:
                super.onChange(z);
                break;
            case 2:
                ((AtomicBoolean) ((C15615l) obj).f30485l).set(true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5848l(Object obj, Handler handler, int i) {
        super(handler);
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.yandex) {
            case 1:
                ((C7119l) this.loadAd).amazon(Unit.INSTANCE);
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }
}
