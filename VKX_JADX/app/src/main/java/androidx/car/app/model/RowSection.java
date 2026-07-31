package androidx.car.app.model;

import defpackage.AbstractC0653l;
import defpackage.AbstractC14400l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class RowSection extends Section<Row> {
    private final int mInitialSelectedIndex;

    private RowSection() {
        this.mInitialSelectedIndex = -1;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RowSection)) {
            return false;
        }
        RowSection rowSection = (RowSection) obj;
        return super.equals(rowSection) && this.mInitialSelectedIndex == rowSection.mInitialSelectedIndex;
    }

    public int getInitialSelectedIndex() {
        return this.mInitialSelectedIndex;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.mInitialSelectedIndex));
    }

    public boolean isSelectionGroup() {
        return this.mInitialSelectedIndex >= 0;
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        StringBuilder sb = new StringBuilder("RowSection { initialSelectedIndex: ");
        sb.append(this.mInitialSelectedIndex);
        sb.append(", ");
        return AbstractC0653l.ads(sb, super.toString(), " }");
    }

    private RowSection(AbstractC14400l abstractC14400l) {
        super(abstractC14400l);
        throw null;
    }
}
