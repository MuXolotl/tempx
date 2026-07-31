package androidx.car.app.media.model;

import androidx.car.app.model.Header;
import defpackage.AbstractC18091l;
import defpackage.InterfaceC11389l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class MediaPlaybackTemplate implements InterfaceC11389l {
    private final Header mHeader;

    private MediaPlaybackTemplate() {
        this.mHeader = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaPlaybackTemplate) {
            return Objects.equals(this.mHeader, ((MediaPlaybackTemplate) obj).mHeader);
        }
        return false;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public int hashCode() {
        return Objects.hash(this.mHeader);
    }

    public String toString() {
        return "MediaPlaybackTemplate";
    }

    public MediaPlaybackTemplate(AbstractC18091l abstractC18091l) {
        throw null;
    }
}
