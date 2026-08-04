package defpackage;

import ealvatag.tag.datatype.DataTypes;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؕۜۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3668l {
    public static final /* synthetic */ InterfaceC13922l[] yandex = {new C0114l(AbstractC3668l.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new C0114l(AbstractC3668l.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new C0114l(AbstractC3668l.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new C0114l(AbstractC3668l.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new C0114l(AbstractC3668l.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C0114l(AbstractC3668l.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C0114l(AbstractC3668l.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C0114l(AbstractC3668l.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C0114l(AbstractC3668l.class, DataTypes.OBJ_CONTENT_TYPE, "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new C0114l(AbstractC3668l.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), new C0114l(AbstractC3668l.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", 1), new C0114l(AbstractC3668l.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new C0114l(AbstractC3668l.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new C0114l(AbstractC3668l.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new C0114l(AbstractC3668l.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new C0114l(AbstractC3668l.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new C0114l(AbstractC3668l.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new C0114l(AbstractC3668l.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C0114l(AbstractC3668l.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new C0114l(AbstractC3668l.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new C0114l(AbstractC3668l.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new C0114l(AbstractC3668l.class, "textCompositionRange", "getTextCompositionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/TextRange;", 1), new C0114l(AbstractC3668l.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new C0114l(AbstractC3668l.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C0114l(AbstractC3668l.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new C0114l(AbstractC3668l.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new C0114l(AbstractC3668l.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new C0114l(AbstractC3668l.class, "inputTextSuggestionState", "getInputTextSuggestionState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/InputTextSuggestionState;", 1), new C0114l(AbstractC3668l.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C0114l(AbstractC3668l.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new C0114l(AbstractC3668l.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1), new C0114l(AbstractC3668l.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    static {
        C4707l c4707l = AbstractC0424l.yandex;
        C4707l c4707l2 = AbstractC16601l.yandex;
    }

    public static final void adcel(InterfaceC17593l interfaceC17593l) {
        C4707l c4707l = AbstractC0424l.vip;
        InterfaceC13922l interfaceC13922l = yandex[6];
        interfaceC17593l.amazon(c4707l, Boolean.TRUE);
    }

    public static final void admob(InterfaceC17593l interfaceC17593l, InterfaceC6348l interfaceC6348l) {
        C4707l c4707l = AbstractC0424l.yandex;
        C4707l c4707l2 = AbstractC0424l.ads;
        InterfaceC13922l interfaceC13922l = yandex[8];
        interfaceC17593l.amazon(c4707l2, interfaceC6348l);
    }

    public static void amazon(InterfaceC17593l interfaceC17593l, Function1 function1) {
        interfaceC17593l.amazon(AbstractC16601l.admob, new C7629l(null, function1));
    }

    public static final void billing(InterfaceC17593l interfaceC17593l, C12791l c12791l) {
        C4707l c4707l = AbstractC0424l.subscription;
        InterfaceC13922l interfaceC13922l = yandex[9];
        interfaceC17593l.amazon(c4707l, c12791l);
    }

    public static void crashlytics(InterfaceC17593l interfaceC17593l, Function0 function0) {
        interfaceC17593l.amazon(AbstractC16601l.loadAd, new C7629l(null, function0));
    }

    public static final void firebase(InterfaceC17593l interfaceC17593l, String str) {
        C4707l c4707l = AbstractC0424l.yandex;
        C4707l c4707l2 = AbstractC0424l.amazon;
        InterfaceC13922l interfaceC13922l = yandex[2];
        interfaceC17593l.amazon(c4707l2, str);
    }

    public static final void isPro(InterfaceC17593l interfaceC17593l, int i) {
        C4707l c4707l = AbstractC0424l.firebase;
        InterfaceC13922l interfaceC13922l = yandex[3];
        interfaceC17593l.amazon(c4707l, new C8223l(i));
    }

    public static void loadAd(InterfaceC17593l interfaceC17593l, Function1 function1) {
        interfaceC17593l.amazon(AbstractC16601l.yandex, new C7629l(null, function1));
    }

    public static final void metrica(InterfaceC17593l interfaceC17593l, InterfaceC6347l interfaceC6347l) {
        C4707l c4707l = AbstractC0424l.yandex;
        C4707l c4707l2 = AbstractC0424l.f1548switch;
        InterfaceC13922l interfaceC13922l = yandex[30];
        interfaceC17593l.amazon(c4707l2, interfaceC6347l);
    }

    public static final void mopub(InterfaceC17593l interfaceC17593l, String str) {
        C4707l c4707l = AbstractC0424l.yandex;
        interfaceC17593l.amazon(AbstractC0424l.yandex, Collections.singletonList(str));
    }

    public static void purchase(InterfaceC17593l interfaceC17593l, int i, Function0 function0) {
        interfaceC17593l.amazon(AbstractC0424l.f1552volatile, new C14694l(i));
        interfaceC17593l.amazon(AbstractC16601l.startapp, new C7629l(null, function0));
    }

    public static final void remoteconfig(InterfaceC17593l interfaceC17593l, int i) {
        C4707l c4707l = AbstractC0424l.isVip;
        InterfaceC13922l interfaceC13922l = yandex[14];
        interfaceC17593l.amazon(c4707l, new C6402l(i));
    }

    public static final void smaato(InterfaceC17593l interfaceC17593l, C14519l c14519l) {
        C4707l c4707l = AbstractC0424l.yandex;
        C4707l c4707l2 = AbstractC0424l.crashlytics;
        InterfaceC13922l interfaceC13922l = yandex[1];
        interfaceC17593l.amazon(c4707l2, c14519l);
    }

    public static final void startapp(InterfaceC17593l interfaceC17593l, EnumC13846l enumC13846l) {
        C4707l c4707l = AbstractC0424l.yandex;
        C4707l c4707l2 = AbstractC0424l.f1546private;
        InterfaceC13922l interfaceC13922l = yandex[26];
        interfaceC17593l.amazon(c4707l2, enumC13846l);
    }

    public static final void subs(InterfaceC17593l interfaceC17593l, C5828l c5828l) {
        C4707l c4707l = AbstractC0424l.tapsense;
        InterfaceC13922l interfaceC13922l = yandex[10];
        interfaceC17593l.amazon(c4707l, c5828l);
    }

    public static final void vip(InterfaceC17593l interfaceC17593l, boolean z) {
        C4707l c4707l = AbstractC0424l.yandex;
        C4707l c4707l2 = AbstractC0424l.f1544native;
        InterfaceC13922l interfaceC13922l = yandex[23];
        interfaceC17593l.amazon(c4707l2, Boolean.valueOf(z));
    }

    public static final void yandex(InterfaceC17593l interfaceC17593l) {
        C4707l c4707l = AbstractC0424l.yandex;
        interfaceC17593l.amazon(AbstractC0424l.isPro, Unit.INSTANCE);
    }
}
