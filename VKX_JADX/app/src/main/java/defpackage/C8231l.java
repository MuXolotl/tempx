package defpackage;

import android.content.ClipData;
import android.os.Build;
import kotlin.Unit;

/* JADX INFO: renamed from: lًٍۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8231l implements InterfaceC7948l {
    public final C3633l yandex;

    public C8231l(C3633l c3633l) {
        this.yandex = c3633l;
    }

    public final Unit yandex(C11848l c11848l) {
        C3633l c3633l = this.yandex;
        if (c11848l != null) {
            c3633l.yandex().setPrimaryClip(c11848l.yandex);
        } else if (Build.VERSION.SDK_INT >= 28) {
            AbstractC13950l.billing(c3633l.yandex());
        } else {
            c3633l.yandex().setPrimaryClip(ClipData.newPlainText("", ""));
        }
        return Unit.INSTANCE;
    }
}
