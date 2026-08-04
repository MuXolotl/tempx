package ua.itaysonlab.vkapi2.internal.objects;

import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/internal/objects/VKRequestParameter;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class VKRequestParameter {
    public final String loadAd;
    public final String yandex;

    public VKRequestParameter(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKRequestParameter)) {
            return false;
        }
        VKRequestParameter vKRequestParameter = (VKRequestParameter) obj;
        return AbstractC8576l.yandex(this.yandex, vKRequestParameter.yandex) && AbstractC8576l.yandex(this.loadAd, vKRequestParameter.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKRequestParameter(key=");
        sb.append(this.yandex);
        sb.append(", value=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
