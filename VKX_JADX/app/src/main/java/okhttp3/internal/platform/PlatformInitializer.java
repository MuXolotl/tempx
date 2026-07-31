package okhttp3.internal.platform;

import android.content.Context;
import defpackage.AbstractC16844l;
import defpackage.C2580l;
import defpackage.InterfaceC12058l;
import defpackage.InterfaceC13497l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Llْٛٗ;", "Llٌٗؒ;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlatformInitializer implements InterfaceC13497l {
    @Override // defpackage.InterfaceC13497l
    public final List loadAd() {
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC13497l
    public final Object yandex(Context context) {
        AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
        Object obj = AbstractC16844l.yandex;
        InterfaceC12058l interfaceC12058l = obj != null ? (InterfaceC12058l) obj : null;
        if (interfaceC12058l != null) {
            interfaceC12058l.yandex(context);
        }
        return AbstractC16844l.yandex;
    }
}
