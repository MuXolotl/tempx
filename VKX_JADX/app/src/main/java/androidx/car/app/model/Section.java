package androidx.car.app.model;

import androidx.car.app.serialization.ListDelegateImpl;
import defpackage.AbstractC14651l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC12298l;
import defpackage.InterfaceC17124l;
import defpackage.InterfaceC5986l;
import j$.util.Objects;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public abstract class Section<T extends InterfaceC17124l> {
    private final InterfaceC12298l mItemsDelegate;
    private final CarText mNoItemsMessage;
    private final InterfaceC5986l mOnItemVisibilityChangedDelegate;
    private final CarText mTitle;

    public Section() {
        this.mItemsDelegate = new ListDelegateImpl(Collections.EMPTY_LIST);
        this.mTitle = null;
        this.mNoItemsMessage = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        if (Objects.equals(this.mItemsDelegate, section.mItemsDelegate) && Objects.equals(this.mTitle, section.mTitle) && Objects.equals(this.mNoItemsMessage, section.mNoItemsMessage)) {
            if (Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null).equals(Boolean.valueOf(section.mOnItemVisibilityChangedDelegate == null))) {
                return true;
            }
        }
        return false;
    }

    public InterfaceC12298l getItemsDelegate() {
        return this.mItemsDelegate;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public InterfaceC5986l getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mItemsDelegate, this.mTitle, this.mNoItemsMessage, Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Section { title: ");
        sb.append(this.mTitle);
        sb.append(", noItemsMessage: ");
        sb.append(this.mNoItemsMessage);
        sb.append(", itemsDelegate: ");
        sb.append(this.mItemsDelegate);
        sb.append(", onItemVisibilityChangedDelegate: ");
        sb.append(this.mOnItemVisibilityChangedDelegate != null);
        return sb.toString();
    }

    public Section(AbstractC14651l abstractC14651l) {
        throw null;
    }
}
