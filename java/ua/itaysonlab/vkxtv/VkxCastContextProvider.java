package ua.itaysonlab.vkxtv;

import android.content.Context;
import defpackage.AbstractC12832l;
import defpackage.C12100l;
import defpackage.C15318l;
import defpackage.C1901l;
import defpackage.C2490l;
import defpackage.C4465l;
import defpackage.C6541l;
import defpackage.C8688l;
import defpackage.InterfaceC3563l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lua/itaysonlab/vkxtv/VkxCastContextProvider;", "Llؕۗؒ;", "<init>", "()V", "Landroid/content/Context;", "p0", "Llِۚٚ;", "getCastOptions", "(Landroid/content/Context;)Llِۚٚ;", "", "Llٔۦۗ;", "getAdditionalSessionProviders", "(Landroid/content/Context;)Ljava/util/List;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VkxCastContextProvider implements InterfaceC3563l {
    @Override // defpackage.InterfaceC3563l
    public List<C15318l> getAdditionalSessionProviders(Context p0) {
        return null;
    }

    @Override // defpackage.InterfaceC3563l
    public C12100l getCastOptions(Context p0) {
        ArrayList arrayList = new ArrayList();
        C1901l c1901l = new C1901l();
        ArrayList arrayList2 = new ArrayList();
        C8688l c8688l = C2490l.subs;
        String strAds = AbstractC12832l.crashlytics().admob.ads();
        C4465l c4465l = C12100l.f24027l;
        if (c4465l != null) {
            return new C12100l(strAds, arrayList, true, c1901l, false, c4465l, true, 0.05000000074505806d, false, false, false, arrayList2, false, false, C12100l.f24029l, C12100l.f24028l, false, false);
        }
        C6541l.subs("use Optional.orNull() instead of Optional.or(null)");
        return null;
    }
}
