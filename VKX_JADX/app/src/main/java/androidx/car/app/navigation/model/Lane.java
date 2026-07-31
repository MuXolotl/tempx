package androidx.car.app.navigation.model;

import defpackage.AbstractC14814l;
import defpackage.AbstractC6427l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class Lane {
    private final List<LaneDirection> mDirections;

    public Lane(List<LaneDirection> list) {
        this.mDirections = AbstractC6427l.remoteconfig(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Lane) {
            return Objects.equals(this.mDirections, ((Lane) obj).mDirections);
        }
        return false;
    }

    public List<LaneDirection> getDirections() {
        List<LaneDirection> list = this.mDirections;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public int hashCode() {
        return Objects.hashCode(this.mDirections);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[direction count: ");
        List<LaneDirection> list = this.mDirections;
        return AbstractC14814l.remoteconfig(list != null ? list.size() : 0, "]", sb);
    }

    private Lane() {
        this.mDirections = Collections.EMPTY_LIST;
    }
}
