package androidx.car.app.model;

import androidx.car.app.messaging.model.ConversationItem;
import defpackage.AbstractC12589l;
import defpackage.AbstractC6427l;
import defpackage.C11722l;
import defpackage.C1694l;
import defpackage.C5233l;
import defpackage.C5962l;
import defpackage.C8081l;
import defpackage.C8339l;
import defpackage.C9020l;
import defpackage.InterfaceC11389l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC17124l;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class ListTemplate implements InterfaceC11389l {
    static final int MAX_ALLOWED_ITEMS = 100;
    static final int MAX_MESSAGES_PER_CONVERSATION = 10;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final List<Action> mActions;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final List<SectionedItemList> mSectionedLists;
    private final ItemList mSingleList;

    @Deprecated
    private final CarText mTitle;

    public ListTemplate(C11722l c11722l) {
        this.mIsLoading = c11722l.yandex;
        this.mTitle = c11722l.amazon;
        this.mHeaderAction = c11722l.purchase;
        this.mSingleList = c11722l.loadAd;
        this.mSectionedLists = AbstractC6427l.remoteconfig(c11722l.crashlytics);
        this.mActionStrip = c11722l.billing;
        this.mActions = AbstractC6427l.remoteconfig(c11722l.mopub);
        this.mHeader = c11722l.admob;
    }

    public static List<SectionedItemList> getTruncatedCopy(List<SectionedItemList> list) {
        C9020l c9020l = new C9020l();
        c9020l.yandex = MAX_ALLOWED_ITEMS;
        ArrayList arrayList = new ArrayList();
        for (SectionedItemList sectionedItemList : list) {
            arrayList.add(SectionedItemList.create(truncate(sectionedItemList.getItemList(), c9020l), sectionedItemList.getHeader().toCharSequence()));
            if (c9020l.yandex <= 0) {
                break;
            }
        }
        return arrayList;
    }

    public static ItemList truncate(ItemList itemList, C9020l c9020l) {
        C5962l c5962l = new C5962l(itemList);
        ArrayList<InterfaceC17124l> arrayList = c5962l.yandex;
        arrayList.clear();
        for (InterfaceC17124l interfaceC17124l : itemList.getItems()) {
            if (!(interfaceC17124l instanceof ConversationItem)) {
                if (c9020l.yandex < 1) {
                    break;
                }
                Objects.requireNonNull(interfaceC17124l);
                arrayList.add(interfaceC17124l);
                c9020l.yandex--;
            } else {
                ConversationItem conversationItem = (ConversationItem) interfaceC17124l;
                if (c9020l.yandex < 2) {
                    break;
                }
                C1694l c1694l = new C1694l(conversationItem);
                int i = c9020l.yandex - 1;
                c9020l.yandex = i;
                int iMin = Math.min(i, 10);
                int size = conversationItem.getMessages().size();
                int iMin2 = Math.min(size, iMin);
                c1694l.billing = conversationItem.getMessages().subList(size - iMin2, size);
                arrayList.add(new ConversationItem(c1694l));
                c9020l.yandex -= iMin2;
            }
        }
        if (c5962l.crashlytics != null) {
            int size2 = arrayList.size();
            if (size2 == 0) {
                C8339l.smaato("A selectable list cannot be empty");
                return null;
            }
            int i2 = c5962l.loadAd;
            if (i2 >= size2) {
                C8339l.smaato(AbstractC12589l.applovin(i2, size2, "The selected item index (", ") is larger than the size of the list (", ")"));
                return null;
            }
            for (InterfaceC17124l interfaceC17124l2 : arrayList) {
                if (ItemList.getOnClickDelegate(interfaceC17124l2) != null) {
                    C8339l.smaato("Items that belong to selectable lists can't have an onClickListener. Use the OnSelectedListener of the list instead");
                    return null;
                }
                if (ItemList.getToggle(interfaceC17124l2) != null) {
                    C8339l.smaato("Items that belong to selectable lists can't have a toggle");
                    return null;
                }
            }
        }
        return new ItemList(c5962l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListTemplate)) {
            return false;
        }
        ListTemplate listTemplate = (ListTemplate) obj;
        return this.mIsLoading == listTemplate.mIsLoading && Objects.equals(this.mTitle, listTemplate.mTitle) && Objects.equals(this.mHeaderAction, listTemplate.mHeaderAction) && Objects.equals(this.mSingleList, listTemplate.mSingleList) && Objects.equals(this.mSectionedLists, listTemplate.mSectionedLists) && Objects.equals(this.mActionStrip, listTemplate.mActionStrip) && Objects.equals(this.mActions, listTemplate.mActions) && Objects.equals(this.mHeader, listTemplate.mHeader);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        C5233l c5233l = new C5233l();
        CarText carText = this.mTitle;
        if (carText != null) {
            c5233l.crashlytics = carText;
            C8081l.purchase.loadAd(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            c5233l.loadAd(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            for (Action action2 : actionStrip.getActions()) {
                Objects.requireNonNull(action2);
                c5233l.yandex.add(action2);
            }
        }
        return c5233l.yandex();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public List<SectionedItemList> getSectionedLists() {
        List<SectionedItemList> list = this.mSectionedLists;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public ItemList getSingleList() {
        return this.mSingleList;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mHeaderAction, this.mSingleList, this.mSectionedLists, this.mActionStrip, this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public C11722l toBuilder() {
        return new C11722l(this);
    }

    public String toString() {
        return "ListTemplate";
    }

    private ListTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mHeaderAction = null;
        this.mSingleList = null;
        List list = Collections.EMPTY_LIST;
        this.mSectionedLists = list;
        this.mActionStrip = null;
        this.mActions = list;
        this.mHeader = null;
    }
}
