package androidx.media3.cast;

import android.content.Context;
import defpackage.C12100l;
import defpackage.C15318l;
import defpackage.C1901l;
import defpackage.C4465l;
import defpackage.C6541l;
import defpackage.InterfaceC3563l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultCastOptionsProvider implements InterfaceC3563l {
    @Override // defpackage.InterfaceC3563l
    public List<C15318l> getAdditionalSessionProviders(Context context) {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.InterfaceC3563l
    public C12100l getCastOptions(Context context) {
        ArrayList arrayList = new ArrayList();
        C1901l c1901l = new C1901l();
        ArrayList arrayList2 = new ArrayList();
        C4465l c4465l = C12100l.f24027l;
        if (c4465l != null) {
            return new C12100l("A12D4273", arrayList, true, c1901l, false, c4465l, false, 0.05000000074505806d, false, false, true, arrayList2, true, false, C12100l.f24029l, C12100l.f24028l, false, false);
        }
        C6541l.subs("use Optional.orNull() instead of Optional.or(null)");
        return null;
    }
}
