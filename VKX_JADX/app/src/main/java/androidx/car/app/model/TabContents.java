package androidx.car.app.model;

import defpackage.AbstractC4941l;
import defpackage.InterfaceC11389l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class TabContents {
    public static final String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final InterfaceC11389l mTemplate;

    private TabContents() {
        this.mTemplate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TabContents) {
            return Objects.equals(this.mTemplate, ((TabContents) obj).mTemplate);
        }
        return false;
    }

    public String getContentId() {
        return CONTENT_ID;
    }

    public InterfaceC11389l getTemplate() {
        InterfaceC11389l interfaceC11389l = this.mTemplate;
        Objects.requireNonNull(interfaceC11389l);
        return interfaceC11389l;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplate);
    }

    public String toString() {
        return "[template: " + this.mTemplate + "]";
    }

    public TabContents(AbstractC4941l abstractC4941l) {
        throw null;
    }
}
