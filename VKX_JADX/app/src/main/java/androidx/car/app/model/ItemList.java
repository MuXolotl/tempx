package androidx.car.app.model;

import defpackage.AbstractC14814l;
import defpackage.AbstractC6427l;
import defpackage.C5962l;
import defpackage.InterfaceC11285l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC17124l;
import defpackage.InterfaceC5986l;
import defpackage.InterfaceC6511l;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class ItemList {
    private final List<InterfaceC17124l> mItems;
    private final CarText mNoItemsMessage;
    private final InterfaceC5986l mOnItemVisibilityChangedDelegate;
    private final InterfaceC11285l mOnSelectedDelegate;
    private final int mSelectedIndex;

    public ItemList(C5962l c5962l) {
        this.mSelectedIndex = c5962l.loadAd;
        this.mItems = AbstractC6427l.remoteconfig(c5962l.yandex);
        this.mNoItemsMessage = c5962l.purchase;
        this.mOnSelectedDelegate = c5962l.crashlytics;
        this.mOnItemVisibilityChangedDelegate = c5962l.amazon;
    }

    public static InterfaceC6511l getOnClickDelegate(InterfaceC17124l interfaceC17124l) {
        if (interfaceC17124l instanceof Row) {
            return ((Row) interfaceC17124l).getOnClickDelegate();
        }
        if (interfaceC17124l instanceof GridItem) {
            return ((GridItem) interfaceC17124l).getOnClickDelegate();
        }
        return null;
    }

    public static Toggle getToggle(InterfaceC17124l interfaceC17124l) {
        if (interfaceC17124l instanceof Row) {
            return ((Row) interfaceC17124l).getToggle();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemList)) {
            return false;
        }
        ItemList itemList = (ItemList) obj;
        if (this.mSelectedIndex == itemList.mSelectedIndex && Objects.equals(this.mItems, itemList.mItems)) {
            if (Boolean.valueOf(this.mOnSelectedDelegate == null).equals(Boolean.valueOf(itemList.mOnSelectedDelegate == null))) {
                if (Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null).equals(Boolean.valueOf(itemList.mOnItemVisibilityChangedDelegate == null)) && Objects.equals(this.mNoItemsMessage, itemList.mNoItemsMessage)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<InterfaceC17124l> getItems() {
        List<InterfaceC17124l> list = this.mItems;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public InterfaceC5986l getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public InterfaceC11285l getOnSelectedDelegate() {
        return this.mOnSelectedDelegate;
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mSelectedIndex), this.mItems, Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), this.mNoItemsMessage);
    }

    public C5962l toBuilder() {
        return new C5962l(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ items: ");
        List<InterfaceC17124l> list = this.mItems;
        sb.append(list != null ? list.toString() : null);
        sb.append(", selected: ");
        return AbstractC14814l.remoteconfig(this.mSelectedIndex, "]", sb);
    }

    private ItemList() {
        this.mSelectedIndex = 0;
        this.mItems = Collections.EMPTY_LIST;
        this.mNoItemsMessage = null;
        this.mOnSelectedDelegate = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
