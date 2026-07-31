package androidx.car.app.model;

import defpackage.AbstractC15279l;
import defpackage.AbstractC5020l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC17319l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class Toggle {
    private final boolean mIsChecked;
    private final boolean mIsEnabled;
    private final InterfaceC17319l mOnCheckedChangeDelegate;

    private Toggle() {
        this.mOnCheckedChangeDelegate = null;
        this.mIsChecked = false;
        this.mIsEnabled = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Toggle)) {
            return false;
        }
        Toggle toggle = (Toggle) obj;
        return this.mIsChecked == toggle.mIsChecked && this.mIsEnabled == toggle.mIsEnabled;
    }

    public InterfaceC17319l getOnCheckedChangeDelegate() {
        InterfaceC17319l interfaceC17319l = this.mOnCheckedChangeDelegate;
        Objects.requireNonNull(interfaceC17319l);
        return interfaceC17319l;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsChecked), Boolean.valueOf(this.mIsEnabled));
    }

    public boolean isChecked() {
        return this.mIsChecked;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ isChecked: ");
        sb.append(this.mIsChecked);
        sb.append(", isEnabled: ");
        return AbstractC5020l.Signature(sb, this.mIsEnabled, "]");
    }

    public Toggle(AbstractC15279l abstractC15279l) {
        throw null;
    }
}
