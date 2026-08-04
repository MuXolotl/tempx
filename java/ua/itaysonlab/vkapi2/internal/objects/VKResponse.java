package ua.itaysonlab.vkapi2.internal.objects;

import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkapi2/internal/objects/VKResponse;", "T", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class VKResponse<T> {
    public final List crashlytics;
    public final VKError loadAd;
    public final Object yandex;

    public VKResponse(Object obj, VKError vKError, List list) {
        this.yandex = obj;
        this.loadAd = vKError;
        this.crashlytics = list;
    }
}
